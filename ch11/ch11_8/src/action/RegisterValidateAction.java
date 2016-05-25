package action;

import java.util.regex.Pattern;

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

	@Override
	public void validate() {
		if(user.getUserName() == null || user.getUserName().length() <= 0) {
			addFieldError("user.userName", "用户名不能为空！");
		} else {
			String f1 = "[a-zA-Z]\\w*";
			if(!Pattern.matches(f1, user.getUserName())) {
				addFieldError("user.userName", "用户名格式不正确！");
			}
		}
		if(user.getUserPwd() == null || user.getUserPwd().length() <= 0) {
			addFieldError("user.userPwd", "密码不能为空！");
		} else {
			if(user.getUserPwd().length() < 6) {
				addFieldError("user.userPwd", "密码长度不能小于6！");
			}
		}
		if(userPwd == null || userPwd.length() <= 0) {
			addFieldError("userPwd", "确认密码不能为空！");
		} else {
			if(!userPwd.equals(user.getUserPwd())) {
				addFieldError("userPwd", "密码不一致！");
			}
		}
		if(user.getUserEmail() == null || user.getUserEmail().length() <= 0) {
			addFieldError("user.userEmail", "邮件地址不能为空！");
		} else {
			String f2 = "\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*.\\w+([-.]\\w+)*";
			if(!Pattern.matches(f2, user.getUserEmail())) {
				addFieldError("user.userEmail", "邮箱地址格式不正确！");
			}
		}
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
