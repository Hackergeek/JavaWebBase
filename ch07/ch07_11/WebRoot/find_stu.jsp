<%@page import="dao.StudentDAO"%>
<%@page import="bean.Student"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html; charset=UTF-8" import="java.sql.*"%>
<html>
<head>
<title>由提交页面获取查询条件并实现查询的页面</title>
</head>
<body>
	<center>
		<%
			request.setCharacterEncoding("UTF-8");
			String id = request.getParameter("id");
			Student s = new Student();
			s.setId(Integer.parseInt(id));
			StudentDAO studentDAO = new StudentDAO();
			Student stu = studentDAO.find(s);
		%>
		<table border="2" bgcolor="ccceee" width="650">
			<tr bgcolor="CCCCCC" align="center">
				<td>学号</td>
				<td>姓名</td>
				<td>性别</td>
				<td>年龄</td>
				<td>体重</td>
				<td>身高</td>
			</tr>
			<tr align="center">
				<td><%=stu.getId()%></td>
				<td><%=stu.getName()%></td>
				<td><%=stu.getSex()%></td>
				<td><%=stu.getAge()%></td>
				<td><%=stu.getWeight()%></td>
				<td><%=stu.getHight()%></td>
			</tr>
		</table>
	</center>
</body>
</html>