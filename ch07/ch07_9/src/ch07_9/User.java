package ch07_9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
	private String username;
	private String userpwd;

	public User() {
		super();
	}

	public User(String username, String userpwd) {
		super();
		this.username = username;
		this.userpwd = userpwd;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public boolean yanzheng_user(String userName, String userPwd) {
		boolean f = false;
		ConnectDbase cdb = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			cdb = new ConnectDbase();
			conn = cdb.getConnect();
			String sql = "select * from user where(uname=? and upassword=?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userName);
			pstmt.setString(2, userPwd);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				f = true;
			} else {
				f = false;
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					if (pstmt != null) {
						try {
							pstmt.close();
						} catch (SQLException e) {
							e.printStackTrace();
						} finally {
							if (conn != null) {
								try {
									conn.close();
								} catch (SQLException e) {
									e.printStackTrace();
								}
							}
						}
					}
				}
			}
		}
		return f;
	}

}
