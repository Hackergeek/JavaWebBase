<%@ page contentType="text/html" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>显示购物车购物信息</title>
  </head>
  <body>
    	你选择的结果是：<br>
    	<%
    		request.setCharacterEncoding("UTF-8");
    		String str = "";
    		if(session.getAttribute("s1") != null) {
    			str = (String)session.getAttribute("s1");
    			out.print(str + "<br>");
    		}
    		
    		if(session.getAttribute("s2") != null) {
    			str = (String)session.getAttribute("s2");
    			out.print(str + "<br>");
    		}
    		
    		if(session.getAttribute("s3") != null) {
    			str = (String)session.getAttribute("s3");
    			out.print(str + "<br>");
    		}
    		
    		if(session.getAttribute("s4") != null) {
    			str = (String)session.getAttribute("s4");
    			out.print(str + "<br>");
    		}
    		
    		if(session.getAttribute("s5") != null) {
    			str = (String)session.getAttribute("s5");
    			out.print(str + "<br>");
    		}
    		
    		if(session.getAttribute("s6") != null) {
    			str = (String)session.getAttribute("s6");
    			out.print(str + "<br>");
    		}
    	 %>
  </body>
</html>
