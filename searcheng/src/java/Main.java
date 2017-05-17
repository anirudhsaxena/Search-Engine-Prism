/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANIRUDH
 */
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
 
 
public class Main {
	public static DB db = new DB();
 
	public static void main(String[] args) throws SQLException, IOException {
		//db.runSql2("TRUNCATE Record;");
		processPage("http://www.olx.com");
	}
 
	public static void processPage(String URL) throws SQLException, IOException{
		//check if the given URL is already in database
		String sql = "select * from Record where URL = '"+URL+"'";
		ResultSet rs = db.runSql(sql);
		if(rs.next()){
 
		}else{
			//store the URL to database to avoid parsing again
                    
			//sql = "INSERT INTO  `Crawler`.`Record` " + "(`URL`) VALUES " + "(?);";
                       //sql ="INSERT INTO `Crawler`.`Record` " + "('URL`, `Title`, `Metadesc`) VALUES " + "(?)(?)(?)";
                       sql="INSERT INTO `crawler`.`record` (`URL`, `Title`, `Metadesc`) VALUES ((?), (?),(?))";
                               
			PreparedStatement stmt = db.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			Document doc = Jsoup.connect("http://www.olx.com").get();
                       String Title =(doc.title());
                        String MetaDesc=(doc.select("meta[name=description]").first().attr("content"));
                       stmt.setString(2, Title);
                       stmt.setString(3,MetaDesc);stmt.setString(1, URL);
                        
                       // stmt.setString(1,Title);
 			stmt.execute();
 
			//get useful information
			//Document doc = Jsoup.connect("http://www.msn.com").get();
                       
                        
 
			if(doc.text().contains("olx")){
				System.out.println(URL);
                                System.out.println("Title: " + doc.title());
                                System.out.println("Text: " + doc.text());
                    System.out.println("Meta Description: " + doc.select("meta[name=description]").first().attr("content"));

			}
 
			//get all links and recursively call the processPage method
			Elements questions = doc.select("a[href]");
			for(Element link: questions){
				if(link.attr("href").contains(""))
					processPage(link.attr("abs:href"));
			}
		}
	}
}