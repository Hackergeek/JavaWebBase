<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>计算任意两整数之间的累加和值的JSP程序</title>
  </head>
  <body>
  	 <% 
  	 	String xx = request.getParameter("shuju1");
  	 	String yy = request.getParameter("shuju2");
  	 	Integer sum = (Integer)request.getAttribute("sum");
  	  %>
  	  <p><%=xx %>加到<%=yy %>的和值是：<%=sum %></p>
  	  <p>现在的时间是：<%=new Date() %></p>
  </body>
</html>
