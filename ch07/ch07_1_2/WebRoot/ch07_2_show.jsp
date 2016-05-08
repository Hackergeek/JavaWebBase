<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>计算任意两整数之间的累加和值的JSP程序</title>
  </head>
  <body>
  	<%! 
  		int sum = 0;
  		int x = 0;
  		int y = 0;
  	 %>
  	 <% 
  	 	String xx = request.getParameter("shuju1");
  	 	String yy = request.getParameter("shuju2");
  	 	x = Integer.parseInt(xx);
  	 	y = Integer.parseInt(yy);
  	 	while(x <= y) {
  	 		sum += x;
  	 		++x;
  	 	}
  	  %>
  	  <p><%=xx %>加到<%=yy %>的和值是：<%=sum %></p>
  	  <p>现在的时间是：<%=new Date() %></p>
  </body>
</html>
