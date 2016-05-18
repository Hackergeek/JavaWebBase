package ch08_11;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Map<String, String> pm = new HashMap<>();
		pm.put("山东", "济南,青岛,泰安,潍坊,烟台,聊城,枣庄,菏泽,莱芜,临沂");
		pm.put("江苏", "南京,苏州,无锡,徐州,南通,连云港,镇江,常州,淮安,扬州");
		pm.put("广东", "广州,深圳,珠海,汕头,佛山,东莞,湛江,江门,中山,惠州");
		response.setCharacterEncoding("UTF-8");
		PrintWriter writer = response.getWriter();
		String s = request.getParameter("proc");
		writer.print(pm.get(s));
	}

}
