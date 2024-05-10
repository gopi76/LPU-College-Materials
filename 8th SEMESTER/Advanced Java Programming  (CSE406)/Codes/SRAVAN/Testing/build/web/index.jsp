<%-- 
    Document   : index
    Created on : 08-Apr-2024, 9:08:48 pm
    Author     : srava
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Random, java.util.ArrayList, java.io.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%!
            int a = 50;
            int b = 10;
            String name = "india";
            
            public int doSum(){
                return a+b;
            }

            public String reverse(){
                StringBuffer br = new StringBuffer(name);
                return br.reverse().toString();
            }
        %>
        
        <%
            out.println(a);
            out.println("<br>");
            out.println(b);
            out.println("<br>");
            out.println(doSum());
            out.println("<br>");
            out.println(reverse());
            
        %>
        
        <h1>
            <%= 
                name
            %>
        </h1>
        
        <%@include file="header.jsp"%>
        <h1>
            Random Number:
            <%
                Random r = new Random();
                int n = r.nextInt(10);
                out.println(n);
            %>
        </h1>
        
        
        
        <%@include file="dateandtime.jsp"%>
    </body>
</html>
