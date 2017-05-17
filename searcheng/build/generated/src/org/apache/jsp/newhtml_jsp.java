package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class newhtml_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<!-- <html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>TODO supply a title</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div>TODO write content</div>\r\n");
      out.write("         <form name=\"sample\" action=\"insert.jsp\">\r\n");
      out.write("   <label> Text 1</label><input type=\"text\" name=\"txt1\" value=\"\"/>\r\n");
      out.write("   <label> Text 2</label><input type=\"text\" name=\"txt2\" value=\"\"/>\r\n");
      out.write("    <input type=\"submit\" value=\"Enter Values\"/>\r\n");
      out.write("    </body>\r\n");
      out.write("</html> -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("    <HEAD>\r\n");
      out.write("        <TITLE>Search Results</TITLE>\r\n");
      out.write("    </HEAD>\r\n");
      out.write("\r\n");
      out.write("    <BODY>\r\n");
      out.write("   <!--     <H1>Database Lookup</H1>\r\n");
      out.write("        <FORM ACTION=\"newhtml.jsp\" METHOD=\"POST\">\r\n");
      out.write("            Please enter the ID of the publisher you want to find:\r\n");
      out.write("            <BR>\r\n");
      out.write("            <INPUT TYPE=\"TEXT\" NAME=\"search\">\r\n");
      out.write("            <BR>\r\n");
      out.write("            <INPUT TYPE=\"SUBMIT\" value=\"Submit\">\r\n");
      out.write("        </FORM>\r\n");
      out.write("\r\n");
      out.write("       --> \r\n");
      out.write("\r\n");
      out.write("        <H1>Fetching Search Results</H1>\r\n");
      out.write("\r\n");
      out.write("              ");

Connection conn = null;
           Class.forName("com.mysql.jdbc.Driver").newInstance();
           conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/crawler","root","");

           Statement stmt= conn.createStatement();

            String id = request.getParameter("search");  

            ResultSet resultset = stmt.executeQuery("SELECT * FROM `record` WHERE `MetaDesc` LIKE '%"+id+"%'") ; 
            
while (resultset.next())
            if(!resultset.next()) {
                out.println("Sorry,could not find more results for you. " +
                "Please <A HREF='tryAgain.html'>try again</A>.");
            } else {
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <h4><a href=\"");
      out.print( resultset.getString(3) );
      out.write('"');
      out.write('>');
      out.print( resultset.getString(3) );
      out.write("</A></h4>\r\n");
      out.write("        <h5><a href=\"");
      out.print( resultset.getString(2) );
      out.write('"');
      out.write('>');
      out.print( resultset.getString(2) );
      out.write("</A></h4>\r\n");
      out.write("        \r\n");
      out.write("        <h6><a href=\"");
      out.print( resultset.getString(4) );
      out.write('"');
      out.write('>');
      out.print( resultset.getString(4) );
      out.write("</A></h4>\r\n");
      out.write("         \r\n");
      out.write("       ");

           } 
       
      out.write("\r\n");
      out.write("      \r\n");
      out.write("    </BODY>\r\n");
      out.write("</HTML>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
