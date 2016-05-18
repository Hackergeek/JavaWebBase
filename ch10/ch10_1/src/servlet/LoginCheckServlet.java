package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginCheckServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String userid = request.getParameter("userid");
		String userpwd = request.getParameter("userpwd");
		String usercheckcode = request.getParameter("checkcode");
		String info = "";
		HttpSession session = request.getSession();
		String servercheckcode = (String) session.getAttribute("checkCode");
		if (!servercheckcode.equalsIgnoreCase(usercheckcode)) {
			info = "验证码不正确，请重新输入";
		} else if ("张三".equals(userid) && "123".equals(userpwd)) {
			info = "登录成功";
		} else {
			info = "用户名或密码不正确";
		}
		request.setAttribute("info", info);
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

}
