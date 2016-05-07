<%@ page language="java" import="java.sql.*" pageEncoding="UTF-8" %>
<%request.setCharacterEncoding("UTF-8"); %>
<html>
	<head><title>利用PreparedStatement对象添加一条记录页面</title></head>
	<body>
		<%
			String driverName = "com.mysql.jdbc.Driver";
			String userName = "root";
			String userPwd = "root";
			String dbName = "students";
			String url1 = "jdbc:mysql://localhost:3306/" + dbName;
			String url2 = "?user=" + userName + "&password=" + userPwd;
			String url3 = "&useUnicode=true&characterEncoding=UTF-8";
			String url = url1 + url2 + url3;
			Class.forName(driverName);
			Connection conn = DriverManager.getConnection(url);
			
			String sql = "Insert into stu_info(id,name,sex,age,weight,hight)values(?,?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			String sex = request.getParameter("sex");
			int age = Integer.parseInt(request.getParameter("age"));
			float weight = Float.parseFloat(request.getParameter("weight"));
			float hight = Float.parseFloat(request.getParameter("hight"));
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, sex);
			pstmt.setInt(4, age);
			pstmt.setFloat(5, weight);
			pstmt.setFloat(6, hight);
			int n = pstmt.executeUpdate();
			if(n==1) {%> 数据插入操作成功！<br><%}
			else {%> 数据插入操作失败！<br><%}
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
			
		 %>
	</body>
</html>