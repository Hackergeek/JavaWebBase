<%@page language="java" pageEncoding="UTF-8" %>
<%request.setCharacterEncoding("UTF-8"); %>
<html>
	<head><title>查询条件提交页面</title></head>
	<body>
		请输入要查询学生的学号:<br><hr width="100%" size="3">
		<form action="find_stu.jsp" method="post">
			学号：&nbsp;<input type="text" name="id"><br> <br>
			<input type="submit" value="查询">
		</form>
	</body>
</html>