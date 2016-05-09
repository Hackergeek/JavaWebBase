<%@page language="java" import="java.sql.*" pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8"); %>
<html>
<head>
<title>删除条件提交页面</title>
</head>
<body>
	请选择要删除学生的学号：
	<hr width="100%" size="3">
	<form action="delete" method="post">
		学号：<input type="text" name="id"> <br> <br> 
		<input type="submit" value="提 交"> &nbsp;&nbsp;&nbsp;&nbsp; <input
			type="reset" value="取 消">
	</form>
</body>
</html>