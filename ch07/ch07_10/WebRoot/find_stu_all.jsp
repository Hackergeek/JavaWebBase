<%@page import="model_Db.DbUtil"%>
<%@page contentType="text/html; charset=UTF-8" import="java.sql.*"%>
<html>
<head>
<title>显示所有学生的页面</title>
</head>
<body>
	<center>
		<%
			request.setCharacterEncoding("UTF-8");
			String sql = "select * from stu_info";
			DbUtil run = new DbUtil();
			ResultSet rs = run.QuerySQL(sql);
			//将光标移动到最后一行之后，然后通过getRow()方法获取当前行号，从而得到学生数据表中的记录数量
			rs.last();
		%>你要查询的学生数据表中共有 <font size="5" color="red"><%=rs.getRow()%></font>人
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
				//将光标移动第一行之前，然后通过next()方法一行一行地遍历学生数据表中的记录
				rs.beforeFirst();
				while (rs.next()) {
			%>
			<tr align="center">
				<td><%=rs.getRow()%></td>
				<td><%=rs.getString("id")%></td>
				<td><%=rs.getString("name")%></td>
				<td><%=rs.getString("sex")%></td>
				<td><%=rs.getString("age")%></td>
				<td><%=rs.getString("weight")%></td>
				<td><%=rs.getString("hight")%></td>
			</tr>
			<%
				}
			%>
		</table>
	</center>
</body>
</html>