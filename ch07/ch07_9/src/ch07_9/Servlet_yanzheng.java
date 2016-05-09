package ch07_9;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet_yanzheng extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("username");
		String password = request.getParameter("userpwd");
		User uu = new User(name, password);
		RequestDispatcher dis = null; // 设置转发的对象
		if(uu.yanzheng_user(uu.getUsername(), uu.getUserpwd())) {
			dis = request.getRequestDispatcher("ch07_9_success.jsp");
		} else {
			dis = request.getRequestDispatcher("ch07_7_error.jsp");
		}
		dis.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
