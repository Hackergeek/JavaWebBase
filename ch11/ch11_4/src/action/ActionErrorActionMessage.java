package action;

import com.opensymphony.xwork2.ActionSupport;

public class ActionErrorActionMessage extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		addActionError("使用ActionError添加错误信息！");
		addActionMessage("使用ActionMessage添加普通信息！");
		return "success";
	}

}
