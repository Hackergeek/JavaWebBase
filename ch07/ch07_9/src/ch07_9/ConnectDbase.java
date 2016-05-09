package ch07_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDbase {
	String driverName = "com.mysql.jdbc.Driver";
	String userName = "root";
	String userPwd = "root";
	String dbName = "user";

	// 实现数据库连接的方法
	public Connection getConnect() throws SQLException, ClassNotFoundException {
		String url1 = "jdbc:mysql://localhost:3306/" + dbName;
		String url2 = "?user=" + userName + "&password=" + userPwd;
		String url3 = "&useUnicode=true&characterEncoding=UTF-8";
		String url = url1 + url2 + url3;
		Class.forName(driverName);
		return DriverManager.getConnection(url);
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

}
