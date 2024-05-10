<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String favLang = "Java";
            Cookie[] theCookies = request.getCookies();
            if(theCookies != null){
                for(Cookie tempCookie : theCookies){
                    if("myApp.favoriteLanguage".equals(tempCookie.getName())){
                        favLang = tempCookie.getValue();
                        break;
                    }
                }
            }
        %>
        
        <h4>New Books for <%= favLang %></h4>
        <ul>
            <li>blah blah blah</li>
            <li>blah blah blah</li>
        </ul>
        
        <h4>Latest News Reports for <%= favLang %></h4>
        <ul>
            <li>blah blah blah</li>
            <li>blah blah blah</li>
        </ul>
        
        <h4>Hot Jobs for <%= favLang %></h4>
        <ul>
            <li>blah blah blah</li>
            <li>blah blah blah</li>
        </ul>
        <hr>
        <a href="cookies-personalize-form.html">Personalize this page</a>
    </body>
</html>
