package controller_Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model_Db.DbUtil;

public class UpdateServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name2 = request.getParameter("name2");
		String sex2 = request.getParameter("sex2");
		int age = Integer.parseInt(request.getParameter("age"));
		double weight = Double.parseDouble(request.getParameter("weight"));
		double hight = Double.parseDouble(request.getParameter("hight"));
		String name = (String) request.getSession().getAttribute("name");
		String sex = (String) request.getSession().getAttribute("sex");

		String sql = "update stu_info set id=" + id + ",name='" + name2
				+ "',sex='" + sex + "',age=" + age + ",weight=" + weight
				+ ",hight=" + hight + " where name='" + name + "' and sex='"
				+ sex + "'";
		DbUtil db = new DbUtil();
		int n = db.updateSQL(sql);
		if (n >= 1) {
			request.getRequestDispatcher("success.jsp").forward(request,
					response);
		} else {
			request.getRequestDispatcher("error.jsp").forward(request,
					response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
