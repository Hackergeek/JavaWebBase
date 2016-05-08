<%@ page language="java" import="java.sql.*" pageEncoding="UTF-8"%>
<html>
<head>
<title>用户验证页面</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
	%>
	<jsp:useBean id="uu" class="ch07_5.User" />
	<jsp:setProperty name="uu" property="*" />
	<%
		if (uu.yanzheng_user(uu.getUsername(), uu.getUserpwd())) {
	%>
	<%=uu.getUsername()%>:登录成功！
	<br>
	<%
		} else {
	%>
	<%=uu.getUsername()%>:登录失败！
	<%
		}
	%>
	<br>
</body>
</html>
