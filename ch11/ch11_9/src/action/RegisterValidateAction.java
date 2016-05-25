package action;

import bean.User;
import bean.UserDbase;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterValidateAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private User user;
	private String userPwd;

	public String register() throws Exception {
		UserDbase ud = new UserDbase();
		if (ud.addUser(user) == 1)
			return "success";
		return "error";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
