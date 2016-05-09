package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDAO;
import bean.Student;

public class UpdateServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int id = Integer.parseInt(request.getParameter("id"));
		String name2 = request.getParameter("name2");
		String sex2 = request.getParameter("sex2");
		int age = Integer.parseInt(request.getParameter("age"));
		float weight = Float.parseFloat(request.getParameter("weight"));
		float hight = Float.parseFloat(request.getParameter("hight"));
		Integer temp = (Integer) request.getSession().getAttribute("temp");
		
		Student stu = new Student();
		stu.setId(temp);
		stu.setName(name2);
		stu.setSex(sex2);
		stu.setAge(age);;
		stu.setWeight(weight);
		stu.setHight(hight);;
		StudentDAO studentDAO = new StudentDAO();
		try {
			studentDAO.update(stu);
			request.getRequestDispatcher("success.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			request.getRequestDispatcher("error.jsp").forward(request, response);
		};
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
