
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String bookType = "Romance";
            
            Cookie[] theCookies = request.getCookies();
            if(theCookies != null){
                for(Cookie tempCookie : theCookies){
                    if("myApp.bookType".equals(tempCookie.getName())){
                        bookType = tempCookie.getValue();
                    }
                }
            }
        %>
        
        <h4>Favourite type <%= bookType %></h4>
        <ul>
            <li>blah blah blah</li>
            <li>blah blah blah</li>
            <li>blah blah blah</li>
        </ul>
        
        <hr>
        <a href="books-formpage.html">Personalize this</a>
    </body>
</html>
