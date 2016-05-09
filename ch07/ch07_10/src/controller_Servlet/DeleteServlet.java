package controller_Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model_Db.DbUtil;

public class DeleteServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String ww1 = request.getParameter("w1");
		String ww2 = request.getParameter("w2");
		String s = "1=1 ";
		if(!name.equals("")) s = s + "and name='"+ name + "' ";
		if(sex!=null) s = s + "and sex='" + sex + "' ";
		double w1,w2;
		if(!ww1.equals("")) {
			w1 = Double.parseDouble(request.getParameter("w1"));
			s = s + "and weight>=" + w1;
		}
		if(!ww2.equals("")) {
			w2 = Double.parseDouble(request.getParameter("w2"));
			s = s + " and weight<=" + w2;
		}
		String sql = "delete from stu_info where " + s;
		System.out.println(sql);
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
