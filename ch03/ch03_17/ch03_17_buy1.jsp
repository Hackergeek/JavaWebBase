<%@ page contentType="text/html" import="java.util.*" pageEncoding="UTF-8"%>

<html>
  <head>
    <title>购买肉类商品页面</title>
  </head>
  <body>
    <%
    	request.setCharacterEncoding("UTF-8");
    	if(request.getParameter("c1") != null) {
    		session.setAttribute("s1", request.getParameter("c1"));
    	}
    	if(request.getParameter("c2") != null) {
    		session.setAttribute("s2", request.getParameter("c2"));
    	}
    	if(request.getParameter("c3") != null) {
    		session.setAttribute("s3", request.getParameter("c3"));
    	}
     %>
     	各种肉类大甩卖，一律十块：<br>
     	<form method="post" action="ch03_17_buy1.jsp">
     		<p>
     			<input type="checkbox" name="c1" value="猪肉">猪肉&nbsp;
     			<input type="checkbox" name="c2" value="牛肉">牛肉&nbsp;
     			<input type="checkbox" name="c3" value="羊肉">羊肉
     		</p>
     		<p>
     			<input type="submit" value="提交" name="B1">
     			<a href="ch03_17_buy2.jsp">买点别的</a>&nbsp;
     			<a href="ch03_17_display.jsp">查看购物车</a>
     		</p>
     	</form>
  </body>
</html>
