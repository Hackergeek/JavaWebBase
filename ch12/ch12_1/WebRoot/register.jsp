<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<html>
  <head>
    <title>用户注册提交页面</title>
  </head>
  <body>
  	<form action="registerservlet" method="post">
  		用户名：<input type="text" name="name"/><br><br>
  		出生日期：<input type="text" name="birthday"/><br><br>
  		<input type="submit" value="注册"/>
  	</form>
  </body>
</html>
