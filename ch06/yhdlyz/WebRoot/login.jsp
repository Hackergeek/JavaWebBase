<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
<title>登录页面</title>
</head>
<body>
	<form action="loginCheck" method="post">
		请输入用户名：<input type="text" name="username"/><br>
		请输入密码：<input type="password" name="userpwd"/><br>
		<input type="submit" value="登录"/>
		<input type="reset"/>
	</form>
	<br>
</body>
</html>
