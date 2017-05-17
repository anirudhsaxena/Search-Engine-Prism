<%-- 
    Document   : index
    Created on : Sep 15, 2014, 1:06:54 AM
    Author     : ANIRUDH
--%>
<?xml version='1.0' encoding='UTF-8' ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">


<%@page contentType="text/html" pageEncoding="UTF-8"%>
           
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html"
      xmlns:f="http://xmlns.jcp.org/jsf/core">
    <h:head>
    <title>Prism Search</title><link rel="stylesheet" type="text/css" href="css1.css" />
    </head>
    <body>
       <div>
           <form name="sample" id="form" action="newhtml.jsp">
                <img src="logo.png" align="middle" alt="Prism Search" />
                <input type="text" name="search" value=""style="height:25px;width: 300px; "/>
                
                <select name="options" style="height: 31px">
            <option selected="true">Web</option>
            <option>Images</option>
            <option>Books</option>
            <option>News</option>
        </select>

                <input type="submit" value="Search" name="btn" style="width: 140px;height: 31px; font-size: 20px;" /> </form>
        
        </div>
        <br><br><br><center>Project Guide: Ms.Sushma Bahuguna</center>
            <br><br><center style=" font-size: 15px">©2014 Anirudh Saxena </center>
    </body>
</html>