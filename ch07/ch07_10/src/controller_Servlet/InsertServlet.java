package controller_Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model_Db.DbUtil;

public class InsertServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String sex = req.getParameter("sex");
		int age = Integer.parseInt(req.getParameter("age"));
		double weight = Double.parseDouble(req.getParameter("weight"));
		double hight = Double.parseDouble(req.getParameter("hight"));
		String sql1 = "insert into stu_info(id,name,sex,age,weight,hight)";
		String sql2 = "values(" + id + ",'" + name + "','" + sex + "'," + age + ","
				+ weight + "," + hight + ")";
		String sql = sql1 + sql2;
		DbUtil run = new DbUtil();
		int n = run.updateSQL(sql);
		if (n >= 1) {
			req.getRequestDispatcher("success.jsp").forward(req, resp);
		} else {
			req.getRequestDispatcher("error.jsp").forward(req, resp);
		}
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}
}
