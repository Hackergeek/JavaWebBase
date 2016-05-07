<%@page contentType="text/html; charset=UTF-8" import="java.sql.*" %>
<html>
	<head><title>利用提交条件删除记录页面</title></head>
	<body>
		<center>
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
			
			request.setCharacterEncoding("UTF-8");
			String name = request.getParameter("name");
			String sex = request.getParameter("sex");
			String ww1 = request.getParameter("w1");
			String ww2 = request.getParameter("w2");
			String s = "1=1 ";
			if(!name.equals("")) s = s + "and name='"+ name + "' ";
			if(sex!=null) s = s + "and sex='" + sex + "' ";
			double w1,w2;
			if(!ww1.equals("")) {
				w1 = Double.parseDouble(request.getParameter("w1"));
				s = s + "and weight>=" + w1;
			}
			if(!ww2.equals("")) {
				w2 = Double.parseDouble(request.getParameter("w2"));
				s = s + " and weight<=" + w2;
			}
			String sql = "delete from stu_info where " + s;
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//（5）调用PreparedStatement对象中的executeUpdate()方法
			int n = pstmt.executeUpdate();
			//（6）根据executeUpdate()方法的返回值，判断执行结果
			if(n>=1) {%> 数据修改操作成功！<br><%}
			else {%> 数据修改操作失败！<br><%}
			
			//（7）关闭所有资源
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		 %>
	</body>
</html>