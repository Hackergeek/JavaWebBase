<%@ page contentType="text/html" language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.naming.*" %>
<html>
  <head>
    <title>MySQL数据源应用</title>
  </head>
  <body>
    <%
    	DataSource ds = null;
    	Connection conn = null;
    	PreparedStatement pstmt = null;
    	ResultSet rs = null;
    	try {
    		//(1)获得对数据源的引用
    		InitialContext ctx = new InitialContext();
    		ds = (DataSource)ctx.lookup("java:comp/env/jdbc/mysql");
    		//(2)获得数据库连接对象
    		conn = ds.getConnection();
    		
    		String sql = "select * from stu_info";
    		pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
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
		<% } catch(Exception e) { %>出现意外，信息是：<%=e.getMessage() %><%} 
		finally{
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				//(3)返回数据库连接到连接池
				conn.close();
		}%>
  </body>
</html>
