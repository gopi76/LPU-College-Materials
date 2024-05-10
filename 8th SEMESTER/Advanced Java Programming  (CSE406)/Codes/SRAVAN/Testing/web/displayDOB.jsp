<%-- 
    Document   : displayDOB
    Created on : 15-Apr-2024, 3:13:57 pm
    Author     : srava
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import= "java.time.LocalDate;"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       Hello, <%= request.getParameter("name")%>
       
       <% String dob = request.getParameter("dateOfBirth"); %>
       <% LocalDate dobplus = LocalDate.of(dob); %>
      
      
    </body>
</html>
