<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>
            Request user agent:
            <%=
            request.getHeader("User-Agent")
            %>
            <br>
            Request language:
            <%=
            request.getLocale()
            %>
        </p>
    </body>
</html>
