<%-- 
    Document   : TagsPractice
    Created on : 11-Apr-2024, 3:14:09 pm
    Author     : srava
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.util.Arrays"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2> Expression tags </h2>
        
        <h3>
            <%= new String("hello world").toUpperCase() %>
        </h3>
        
        <p> 25 multiplied by 4 will give <%= 25*4 %> </p>
        
        <p> <%= 4*3 %> </p>
        <hr>
        
        <h2> Scriptlets tags </h2>
        <p>
            <%
                for(int i=0; i<5; i++){
                    out.println("scriptlets here: "+i +"<br>");
                }
            %>
        </p>
        <hr>
        
        <h2> Declaration tags </h2>
        <p>
            <%!
                public String makeitLower(String name){
                    return name.toLowerCase();
                }
            %>
            
            Printing using Scriptlets tag: <% out.println(makeitLower("SRAVAN<br>"));%>
            Printing using Expression tag: <%= makeitLower("SRAVAN")%>
        </p>
        
        
    </body>
</html>
