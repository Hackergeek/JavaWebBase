<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>用户提交页面</title>
  </head>
  <body>
  	<form action="ch07_5_show.jsp" method="post">
  		用 户 名：<input name="username"><br><br>
  		用户密码：<input name="userpwd" type="password"><br><br>
  		<input type="submit" value="登录">
  	</form>
  </body>
</html>
