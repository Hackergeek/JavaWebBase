<%@ page contentType="text/html" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>求和页面</title>
  </head>
  <body>
    	<%
    		String str1 = request.getParameter("shuju1");
    	    String str2 = request.getParameter("shuju2");
    		double s1 = Double.parseDouble(str1);
    		double s2 = Double.parseDouble(str2);
    		double s3 = s1 + s2;
    		request.setAttribute("st1", s1);
    		request.setAttribute("st2", s2);
    		request.setAttribute("st3", s3);
    	 %>
    	 <jsp:forward page="ch03_9_output.jsp"></jsp:forward>
  </body>
</html>
