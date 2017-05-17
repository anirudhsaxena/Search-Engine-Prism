<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<!-- <html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div>TODO write content</div>
         <form name="sample" action="insert.jsp">
   <label> Text 1</label><input type="text" name="txt1" value=""/>
   <label> Text 2</label><input type="text" name="txt2" value=""/>
    <input type="submit" value="Enter Values"/>
    </body>
</html> -->
<%@ page import="java.sql.*" %>


<HTML>
    <HEAD>
        <link href="newcss.css" rel="stylesheet" type="text/css">
     
        <TITLE>Search Results</TITLE>
    <div id="header">
<span class="title">PRISM Search</span><br>
<span style="margin-left: 28px">"One Search For Everything"</span>
</div>

    </HEAD>
<body>
    <%
Connection conn = null;
           Class.forName("com.mysql.jdbc.Driver").newInstance();
           conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/crawler","root","");

           Statement stmt= conn.createStatement();

            String id = request.getParameter("search");  

            ResultSet resultset = stmt.executeQuery("SELECT * FROM `record` WHERE `URL` LIKE '%"+id+"%'") ; 
            
while (resultset.next())
            if(!resultset.next()) {
                out.println("Sorry,could not find more results for you. " +
                "Please <A HREF='index.jsp'>try again</A>.");
            } else {
        %>
<div id="corporate">
    
<h4><%= resultset.getString(3) %></h4>
</div>

<div id="content">
<h2><a href="<%= resultset.getString(2) %>"><%= resultset.getString(2) %></A></h2>
<h5><p><%= resultset.getString(4) %></p></h5>

       <%
           } 
       %>
      
    </BODY>
</HTML>

