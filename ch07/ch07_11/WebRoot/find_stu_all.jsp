<%@page import="dao.StudentDAO"%>
<%@page import="bean.Student"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html; charset=UTF-8" import="java.sql.*"%>
<html>
<head>
<title>显示所有学生的页面</title>
</head>
<body>
	<center>
		<%! int row; %>
		<%
			request.setCharacterEncoding("UTF-8");
			row = 1;
			StudentDAO studentDAO = new StudentDAO();
			List<Student> list = studentDAO.findAll();
			Iterator<Student> iter = list.iterator();
		%>你要查询的学生数据表中共有 <font size="5" color="red"><%=list.size()%></font>人
		<table border="2" bgcolor="ccceee" width="650">
			<tr bgcolor="CCCCCC" align="center">
				<td>记录条数</td>
				<td>学号</td>
				<td>姓名</td>
				<td>性别</td>
				<td>年龄</td>
				<td>体重</td>
				<td>身高</td>
			</tr>
			<%
				while (iter.hasNext()) {
				Student stu = iter.next();
			%>
			<tr align="center">
				<td><%=row%></td>
				<td><%=stu.getId()%></td>
				<td><%=stu.getName()%></td>
				<td><%=stu.getSex()%></td>
				<td><%=stu.getAge()%></td>
				<td><%=stu.getWeight()%></td>
				<td><%=stu.getHight()%></td>
			</tr>
			<%
				++row;
				}
			%>
		</table>
	</center>
</body>
</html>