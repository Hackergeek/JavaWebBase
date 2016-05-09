<%@page import="model_Db.DbUtil"%>
<%@page contentType="text/html; charset=UTF-8" import="java.sql.*" %>
<html>
	<head><title>由提交页面获取查询条件并实现查询的页面</title></head>
	<body>
		<center>
		<%
			request.setCharacterEncoding("UTF-8");
			String sex = request.getParameter("sex");
			double weight1 = Double.parseDouble(request.getParameter("w1"));
			double weight2 = Double.parseDouble(request.getParameter("w2"));
			double temp;
			if(weight1 > weight2) {
				temp = weight1;
				weight1 = weight2;
				weight2 = weight1;
			}
			String sql = "select * from stu_info where sex='" + sex + "' and weight>=" + weight1 + " and weight<=" + weight2;
			DbUtil run = new DbUtil();
			ResultSet rs = run.QuerySQL(sql);
			if(rs == null) {
				out.print(sql);
				return;
			}
			rs.last();
		 %>你要查詢的學生數據表中共有
		 <font size="5" color="red"><%=rs.getRow()%></font>人
		 <table border="2" bgcolor="ccceee" width="650">
		 	<tr bgcolor="CCCCCC" align="center">
		 		<td>记录条数</td><td>学号</td><td>姓名</td>
		 		<td>性别</td><td>年龄</td><td>体重</td><td>身高</td>
		 	</tr>
		 <%rs.beforeFirst();
		 	while(rs.next()) {
		  %> <tr align="center">
		  		<td><%=rs.getRow() %></td>
		  		<td><%=rs.getString("id") %></td>
		  		<td><%=rs.getString("name") %></td>
		  		<td><%=rs.getString("sex") %></td>
		  		<td><%=rs.getString("age") %></td>
		  		<td><%=rs.getString("weight") %></td>
		  		<td><%=rs.getString("hight") %></td>
		  	</tr>
		  	<%} %>
		 </table>
		</center>
	</body>
</html>