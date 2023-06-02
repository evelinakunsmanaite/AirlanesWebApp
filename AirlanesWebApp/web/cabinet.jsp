<%-- 
    Document   : cabinet
    Created on : 22 мая 2023 г., 01:37:36
    Author     : Administrator
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="resources/css/cabinetcss.css" rel="stylesheet" />

        <title>JSP Page</title>
    </head>
    <body>
        <h2>Добро пожаловать, <%= session.getAttribute("name")%> <%= session.getAttribute("lastName")%></h2>

        <form class="input-form" action="allAirlanesServlet" method="get">
            <label>Cписок всех рейсов:
                <div class="input-container">
                    <input type="submit" value="Отправить">
                </div></label>
        </form>      

        <form class="input-form" action="destinationServlet" method="post">
            <label>Cписок рейсов для заданного пункта назначения:
                <div class="input-container">
                    <input type="text" name="destination" required placeholder="Введите пункта назначения">
                    <input  type="submit" value="Отправить">
                </div></label>
        </form>       

        <form class="input-form" action="weekServlet" method="post">
            <label>Cписок рейсов для заданного дня недели:
                <div class="input-container">
                    <input type="text" name="week" required placeholder="Введите день недели (Понедельник, Вторник, Среда, Четверг, Пятгица)">
                    <input type="submit" value="Отправить">
                </div></label>
        </form>

        <form class="input-form" action="weekAndTimeServlet" method="post">
            <label>Список рейсов для заданного дня недели, время вылета для которых больше заданного:
                <div class="input-container-second">
                    <input type="text" name="week" required placeholder="Введите день недели (Понедельник, Вторник..)">
                    <input type="text" name="time" required placeholder="Введите время вылета рейса (hh:mm)">
                    <input type="submit" value="Отправить">
                </div></label>
        </form>

        <a href="index.jsp">Назад</a>  


    </body>
</html>