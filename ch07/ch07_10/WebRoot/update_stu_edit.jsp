<%@page import="model_Db.DbUtil"%>
<%@page language="java" import="java.sql.*" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<html>
<head>
<title>修改编辑页面</title>
</head>
<body>
	<%
		String sex = request.getParameter("sex");
		String name = request.getParameter("name");
		session.setAttribute("sex", sex);
		session.setAttribute("name", name);
		String sql = "select * from stu_info where sex='" + sex
				+ "' and name='" + name + "'";
		DbUtil run = new DbUtil();
		ResultSet rs = run.QuerySQL(sql);
		if (rs.next()) {
			int id = rs.getInt("id");
			String name2 = rs.getString("name");
			String sex2 = rs.getString("sex");
			int age = rs.getInt("age");
			double weight = rs.getDouble("weight");
			double hight = rs.getDouble("hight");
	%>
	<form action="update" method="post">
		<table border="0" width="238" height="252">
			<tr>
				<td>学号</td>
				<td><input name="id" value=<%=id%>></td>
			</tr>
			<tr>
				<td>姓名</td>
				<td><input name="name2" value=<%=name2%>></td>
			</tr>
			<tr>
				<td>性别</td>
				<td><input name="sex2" value=<%=sex2%>></td>
			</tr>
			<tr>
				<td>年龄</td>
				<td><input name="age" value=<%=age%>></td>
			</tr>
			<tr>
				<td>体重</td>
				<td><input name="weight" value=<%=weight%>></td>
			</tr>
			<tr>
				<td>身高</td>
				<td><input name="hight" value=<%=hight%>></td>
			</tr>
			<tr align="center">
				<td colspan="2"><input type="submit" value="提交">&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="reset" value="取消"></td>
			</tr>
		</table>
	</form>
	<%
		} else {
	%>
	没有找到合适条件的记录！！<%
		
		}
	%>
</body>
</html>