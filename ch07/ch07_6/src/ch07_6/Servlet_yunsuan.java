package ch07_6;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet_yunsuan extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String s1 = request.getParameter("shuju1");
		String s2 = request.getParameter("shuju2");
		int d1 = Integer.parseInt(s1);
		int d2 = Integer.parseInt(s2);
		int sum = 0;
		while(d1 <= d2) {
			sum += d1;
			++d1;
		}
		request.setAttribute("sum", sum);
		request.getRequestDispatcher("ch07_6_show.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
