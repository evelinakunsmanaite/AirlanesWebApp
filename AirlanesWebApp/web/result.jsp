<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="resources/css/resultcss.css" rel="stylesheet" />

        <title>JSP Page</title>
    </head>
    <body>
        <c:choose>
            <c:when test="${not empty result}">
                <table>
                    <thead>
                    <th>Номер рейса</th>
                    <th>Тип самолёта</th>
                    <th>Пункт назначения</th>
                    <th>Время вылета</th>
                    <th>День недели</th>
  
                </thead>
                <c:forEach var="a" items="${result}">
                    <tr>
                        <td>${a.flightNumber}</td>
                        <td>${a.airplaneType}</td>
                        <td>${a.destination}</td>
                        <td>${a.departureTime}</td>
                        <td>${a.week}</td>
                        </tr>
                </c:forEach>
            </table>
        </c:when>
        <c:otherwise>
            <c:out value="искомые данные отсутствуют" />
        </c:otherwise>
    </c:choose>
    <a href="cabinet.jsp">Назад</a>  
</body>
</html>
