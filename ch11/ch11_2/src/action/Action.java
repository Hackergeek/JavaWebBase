package action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class Action {
	private HttpServletRequest request;
	private HttpSession session;
	private ServletContext application;
	private int x, y, sum;

	public Action() {
		this.request = ServletActionContext.getRequest();
		this.session = this.request.getSession();
		this.application = this.request.getServletContext();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getSum() {
		return sum;
	}

	public String execute() {
		sum = x + y;
		request.setAttribute("x", x);
		session.setAttribute("y", y);
		application.setAttribute("sum", sum);
		if (sum >= 0)
			return "+";
		else
			return "-";
	}
}
