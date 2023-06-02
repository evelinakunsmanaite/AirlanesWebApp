<%-- 
    Document   : index
    Created on : 23 мая 2023 г., 07:53:09
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <link href="resources/css/indexcss.css" rel="stylesheet" />

        <title>JSP Page</title>
    </head>
   <body></body>
<div class="animated bounceInDown">
  <div class="container">
    <span class="error animated tada" id="msg"></span>
    <form method="post" action="helloServlet" name="form1" class="box" >
      <h4>Войти</h4>
        <input type="text" name="login" placeholder="Логин">
        <i class="typcn typcn-eye" id="eye"></i>
        <input type="password" name="password" placeholder="Пароль" id="pwd">

        <input type="submit" value="Войти" class="btn1">
      </form>

  </div> 

</div>
   
    </body>
</html>
