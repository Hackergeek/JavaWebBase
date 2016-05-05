<%@ page language="java" import="java.sql.*" pageEncoding="UTF-8" %>
<html>
	<head><title>利用PreparedStatement对象添加一条记录页面</title></head>
	<body>
		<%	
			//利用PreparedStatement往数据库中插入一条记录，步骤如下：
			//利用JDBC驱动程序直接连接数据库
			//（1）注册驱动并建立数据库连接
			String driverName = "com.mysql.jdbc.Driver";
			String userName = "root";
			String userPwd = "root";
			String dbName = "student";
			String url1 = "jdbc:mysql://localhost:3306/" + dbName;
			String url2 = "?user=" + userName + "&password=" + userPwd;
			String url3 = "&useUnicode=true&characterEncoding=UTF-8";
			String url = url1 + url2 + url3;
			Class.forName(driverName);
			Connection conn = DriverManager.getConnection(url);
			
			//（2）形成插入SQL语句（带参数）
			String sql = "Insert into students_info(id,name,sex,age,weight,hight)values(?,?,?,?,?,?)";
			//不带参数的插入SQL语句
			//String sql = "Insert into students_info(id,name,sex,age,weight,hight)values(16,'张三','男',20,70,175)"
			//（3）利用数据库连接对象建立PreparedStatement对象
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//（4）若SQL语句带参数，则对SQL语句中各参数设置相应的参数值
			pstmt.setInt(1, 16);
			pstmt.setString(2, "张三");
			pstmt.setString(3, "男");
			pstmt.setInt(4, 20);
			pstmt.setFloat(5, 70);
			pstmt.setFloat(6, 175);
			//（5）执行更新，若该方法执行成功，则表明数据插入操作成功，返回值大于0
			int n = pstmt.executeUpdate();
			//（6）根据executeUpdate（）方法的返回值判断执行结果
			if(n==1) {%> 数据插入操作成功！<br><%}
			else {%> 数据插入操作失败！<br><%}
			//（7）关闭所有资源
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
			
		 %>
	</body>
</html>