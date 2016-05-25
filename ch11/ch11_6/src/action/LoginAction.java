package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String name;
	private String password;
	private String title;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String execute() throws Exception {
		if(getName().equals("QQ") && getPassword().equals("123")) {
			ActionContext.getContext().getSession().put("name", getName());
			return "success";
		} else {
			return "error";
		}
	}
	
	
}
