<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        The Student is confirmed:
        <%= request.getParameter("firstName") %>
        <%= request.getParameter("lastName") %>
        <br>
        The Student is confirmed:
        ${param.firstName} ${param.lastName}
    </body>
</html>
