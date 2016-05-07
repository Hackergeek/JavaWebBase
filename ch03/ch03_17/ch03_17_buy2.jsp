<%@ page contentType="text/html" import="java.util.*" pageEncoding="UTF-8"%>

<html>
  <head>
    <title>购买球类商品页面</title>
  </head>
  <body>
    <%
    	request.setCharacterEncoding("UTF-8");
    	if(request.getParameter("b1") != null) {
    		session.setAttribute("s4", request.getParameter("b1"));
    	}
    	if(request.getParameter("b2") != null) {
    		session.setAttribute("s5", request.getParameter("b2"));
    	}
    	if(request.getParameter("b3") != null) {
    		session.setAttribute("s6", request.getParameter("b3"));
    	}
     %>
     	各种球大甩卖，一律八块：<br>
     	<form method="post" action="ch03_17_buy2.jsp">
     		<p>
     			<input type="checkbox" name="b1" value="篮球">篮球&nbsp;
     			<input type="checkbox" name="b2" value="足球">足球&nbsp;
     			<input type="checkbox" name="b3" value="排球">排球
     		</p>
     		<p>
     			<input type="submit" value="提交" name="x1">
     			<a href="ch03_17_buy1.jsp">买点别的</a>&nbsp;
     			<a href="ch03_17_display.jsp">查看购物车</a>
     		</p>
     	</form>
  </body>
</html>
