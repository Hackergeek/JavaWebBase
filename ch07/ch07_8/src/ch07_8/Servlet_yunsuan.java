package ch07_8;

import java.io.IOException;
import java.io.PrintWriter;

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
		Add add = new Add(d1, d2);
		int sum = add.sum();
		request.setAttribute("d1", d1);
		request.setAttribute("d2", d2);
		request.setAttribute("sum", sum);
		request.getRequestDispatcher("ch07_8_show.jsp").forward(request,
				response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
