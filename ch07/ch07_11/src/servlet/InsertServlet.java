package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.Student;
import dao.StudentDAO;

public class InsertServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		req.setCharacterEncoding("utf-8");
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String sex = req.getParameter("sex");
		String age = req.getParameter("age");
		String weight = req.getParameter("weight");
		String hight = req.getParameter("hight");
		Student stu = new Student();
		stu.setId(Integer.parseInt(id));
		stu.setAge(Integer.parseInt(age));
		stu.setName(name);
		stu.setSex(sex);
		stu.setWeight(Float.parseFloat(weight));
		stu.setHight(Float.parseFloat(hight));
		StudentDAO studentDAO = new StudentDAO();
		try {
			if(studentDAO.create(stu) != null){
				req.getRequestDispatcher("success.jsp").forward(req, resp);
			} else {
				req.getRequestDispatcher("error.jsp").forward(req, resp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		this.doGet(req, resp);
	}
}
