<%-- 
    Document   : error
    Created on : 21 мая 2023 г., 18:30:03
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="resources/css/errorcss.css" rel="stylesheet" />

        <title>Ошибка</title>
    </head>
    <body>
    <marquee behavior="alternate"direction="right" ><img src="resources/img/arp.gif" width="100" height="100"></marquee><br><br><h1><em style='color:red;'>  ${error}</em></h1>
      
        <a href="index.jsp">Назад</a>         
    </body>
</html>
