<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <%
        String bookType = request.getParameter("bookType");
        
        Cookie theCookie = new Cookie("myApp.bookType", bookType);
        
        theCookie.setMaxAge(60*60*24*365);
        
        response.addCookie(theCookie);
    %>
    <body>
        
        Thanks for choosing your book type ${param.bookType};
        <a href="books-homepage.jsp">Return to homepage.</a>
    </body>
</html>
