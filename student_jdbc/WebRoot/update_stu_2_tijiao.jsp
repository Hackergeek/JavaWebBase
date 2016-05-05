<%@page language="java" import="java.sql.*" pageEncoding="UTF-8" %>
<html>
	<head><title>修改记录的条件提交页面</title></head>
	<body>
		<body>
			请选择修改记录所满足的条件<hr width="100%" size="3">
			<form action="update_stu_2_edit.jsp" method="post">
				姓名：<input type="text" name="name"><br><br>
				性别：男<input type="radio" value="男" name="sex">
				女<input type="radio" value="女" name="sex"><br><br>
				<input type="submit" value="提交">
				&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="reset" value="取消">
			</form>
		</body>
	</body>
</html>