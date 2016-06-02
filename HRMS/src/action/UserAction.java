package action;

import org.apache.struts2.interceptor.validation.SkipValidation;

import service.UserDao;
import service.impl.UserDaoImpl;

import com.opensymphony.xwork2.ModelDriven;

import entity.User;

public class UserAction extends SuperAction implements ModelDriven<User> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user = new User();

	// 用户登录动作
	public String login() {
		UserDao userdao = new UserDaoImpl();
		if (userdao.userLogin(user)) {
			//保存登录成功的用户名
			session.setAttribute("loginUserName", user.getUsername());
			return "login_success";
		} else {
			return "login_failure";
		}
	}
	
	@SkipValidation
	//用户注销动作
	public String logout() {
		if(session.getAttribute("loginUserName") != null) {
			session.removeAttribute("loginUserName");
		}
		return "logout_success";
	}
	
	

	@Override
	public void validate() {
		super.validate();
		if("".equals(user.getUsername().trim())) {
			this.addFieldError("usernameError", "用户名不能为空！");
		}
		if(user.getPassword().length() < 6) {
			this.addFieldError("passwordError", "密码长度不少于6位！");
		}
	}

	@Override
	public User getModel() {
		return this.user;
	}

}
