package entity;

//用户信息表
public class User {
	//用户编号
	private String uid;
	//用户名
	private String username;
	//密码
	private String password;
	//权限		0表示普通用户，1表示管理员
	private int authority;
	//员工编号	外键
	private String sid;

	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password="
				+ password + ", authority=" + authority + ", sid=" + sid + "]";
	}

	public User() {
	}

	public User(String uid, String username, String password, int authority,
			String sid) {
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.authority = authority;
		this.sid = sid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAuthority() {
		return authority;
	}

	public void setAuthority(int authority) {
		this.authority = authority;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

}
