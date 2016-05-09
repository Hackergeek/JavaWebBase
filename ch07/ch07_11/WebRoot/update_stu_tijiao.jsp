<%@page language="java" import="java.sql.*" pageEncoding="UTF-8" %>
<%request.setCharacterEncoding("UTF-8"); %>
<html>
	<head><title>修改记录的条件提交页面</title></head>
	<body>
		<body>
			请选择要修改学生的学号：<hr width="100%" size="3">
			<form action="update_stu_edit.jsp" method="post">
				学号：&nbsp;<input type="text" name="id"><br><br>
				<input type="submit" value="提交">
				&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="reset" value="取消">
			</form>
		</body>
	</body>
</html>