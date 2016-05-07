<%@ page contentType="text/html" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>验证页面</title>
  </head>
  <body>
    	<%
    		String name = request.getParameter("RdName");
    		String password = request.getParameter("RdPasswd");
    		if(!(name.equals("abcdef") && password.equals("123456"))) {
    	 		response.sendRedirect("http://sohu.com");
    	 	} else {%>
    	 <jsp:forward page="ch03_11_loginCorrect.jsp"></jsp:forward>    	 
    	 <%} %>
  </body>
</html>
