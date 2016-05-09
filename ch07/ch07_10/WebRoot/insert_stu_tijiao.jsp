<%@page contentType="text/html; charset=UTF-8"%>
<%//设置request对象传递参数的编码，防止乱码 %>
<%request.setCharacterEncoding("UTF-8"); %>
<html>
	<head><title>添加任意学生的提交页面</title></head>
	<body>
		<form action="insert" method="post">
			<table border="0" width="238" height="252">
			<tr><td>学号</td><td><input type="text" name="id"></td></tr>
			<tr><td>姓名</td><td><input type="text" name="name"></td></tr>
			<tr><td>性别</td><td><input type="text" name="sex"></td></tr>
			<tr><td>年龄</td><td><input type="text" name="age"></td></tr>
			<tr><td>体重</td><td><input type="text" name="weight"></td></tr>
			<tr><td>身高</td><td><input type="text" name="hight"></td></tr>
			<tr align="center" >
				<td clospan="2" >
					<input type="submit" value="提 交 ">&nbsp;&nbsp;&nbsp;
					<input type="reset" value="取 消">
				</td>
			</tr>
			</table>
		</form>
	</body>
</html>