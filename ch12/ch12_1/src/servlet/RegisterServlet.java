package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import domain.User;

public class RegisterServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday");
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = null;
		Transaction ts = null;
		try {
			session = sessionFactory.openSession();
			ts = session.beginTransaction();
			User user = new User();
			user.setName(name);
			user.setBirthday(birthday);
			session.save(user);
			ts.commit();
			response.setCharacterEncoding("UTF-8");
			PrintWriter out = response.getWriter();
			response.setContentType("text/plain; charset=utf-8");
			out.println("×¢²á²Ù×÷Íê³É£¡");
		} catch(Exception e) {
			if(ts != null) ts.rollback();
			throw e;
		} finally {
			if(session != null) session.close();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
