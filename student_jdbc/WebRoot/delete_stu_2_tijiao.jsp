<%@page language="java" import="java.sql.*" pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8"); %>
<html>
<head>
<title>删除条件提交页面</title>
</head>
<body>
	请选择删除记录条件
	<hr width="100%" size="3">
	<form action="delete_stu_2.jsp" method="post">
		姓名：<input type="text" name="name"><br> <br> 性别： 男<input
			type="radio" value="男" name="sex"> 女<input type="radio"
			value="女" name="sex"><br> <br> 体重范围：
		<p>
			最小<input type="text" name="w1"> <br> <br> 
			最大<input type="text" name="w2">
		</p>
		<input type="submit" value="提 交"> &nbsp;&nbsp;&nbsp;&nbsp; <input
			type="reset" value="取 消">
	</form>
</body>
</html>