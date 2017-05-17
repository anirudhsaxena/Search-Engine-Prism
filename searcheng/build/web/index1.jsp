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
                   <form action="Myservlet.do" method="get">
        <input type="text" name="nameOne" value="Enter a Name" onClick="if(this.value === 'Enter a Name'){this.value = '';}" /> 
        <input type="submit">
    </form> 
     
        </div>
            </body>
</html>
