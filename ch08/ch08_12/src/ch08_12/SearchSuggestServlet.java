package ch08_12;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchSuggestServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/xml;charset=UTF-8");
		PrintWriter out = response.getWriter();
		HashMap map = new HashMap();
		map.put("a",
				"<words><word>a</word><word>ab</word><word>abc</word><word>abcd</word><word>abcde</word></words>");
		map.put("ab",
				"<words><word>ab</word><word>abc</word><word>abcd</word><word>abcde</word></words>");
		map.put("abc",
				"<words><word>abc</word><word>abcd</word><word>abcde</word></words>");
		map.put("abcd", "<words><word>abcd</word><word>abcde</word></words>");
		map.put("abcde", "<words><word>abcde</word></words>");
		String inputWord = request.getParameter("inputWord");
		if (!map.containsKey(inputWord)) {
			out.println("<words></words>");
		} else {
			out.println(map.get(inputWord).toString());
		}
	}
}
