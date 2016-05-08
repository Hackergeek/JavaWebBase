<%@ page language="java" import="java.sql.*" pageEncoding="UTF-8"%>
<html>
<head>
<title>用户验证页面</title>
</head>
<body>
	<%
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String driverName = "com.mysql.jdbc.Driver";
			String dbName = "user";
			String url1 = "jdbc:mysql://localhost:3306/" + dbName;
			String url2 = "?user=root&password=root";
			String url3 = "&useUnicode=true&characterEncoding=UTF-8";
			String url = url1 + url2 + url3;
			Class.forName(driverName);
			conn = DriverManager.getConnection(url);

			request.setCharacterEncoding("UTF-8");
			String name = request.getParameter("username");
			String password = request.getParameter("userpwd");
			String sql = "select * from user where(uname=? and upassword=?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			if (rs.next()) {
	%>
	<%=name%>:登录成功！
	<br>
	<%
		} else {
	%>
	<%=name%>:登录失败！
	<br>
	<%
		}
		} catch (Exception e) {
	%>
	出现异常错误！
	<br><%=e.getMessage()%>
	<%
		} finally {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}
	%>
</body>
</html>
