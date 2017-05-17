<%-- 
    Document   : insert
    Created on : Nov 6, 2014, 1:39:06 AM
    Author     : ANIRUDH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
           <%
Connection conn = null;
           Class.forName("com.mysql.jdbc.Driver").newInstance();
           conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/searchkey","root","");
           String Keyword=request.getParameter("txt1");
           String Contain=request.getParameter("options");
Statement stmt= conn.createStatement();
int rss=stmt.executeUpdate("insert into keywords(Keyword,Contains) values('"+Keyword+"','"+Contain+"')");
            if(rss>0){ 
               out.print("INSERTED");
            }
           else
            {
            out.print("TRY AGAIN");
            }
            %>
            
            