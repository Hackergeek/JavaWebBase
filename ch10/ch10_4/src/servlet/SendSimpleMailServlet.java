package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendSimpleMailServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter writer = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		SimpleEmail email = new SimpleEmail();
		email.setHostName("smtp.163.com");// 设置邮箱服务器
		email.setAuthentication("javalesson2011", "java2011");// 设置用户名和密码
		try {
			email.addTo(request.getParameter("to"));// 收件人
			email.setFrom("javalesson2011@163.com");// 发件人
			email.setSubject(request.getParameter("title"));// 邮件主题
			email.setMsg(request.getParameter("content"));// 邮件内容
			email.send();//发送邮件
			writer.print("邮件发送成功");
		} catch (EmailException e) {
			e.printStackTrace();
			writer.print("邮件发送失败");
		}
	}

}
