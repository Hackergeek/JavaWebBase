<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>利用JavaBean+JSP求两数和</title>
  </head>
  <body>
  	<jsp:useBean id="he" class="ch07_4.Add"></jsp:useBean>
  	<jsp:setProperty property="*" name="he"/>
  	<p><%=he.getA() %>加到<%=he.getB() %>的和值是：<%=he.sum() %></p>
  	<p>现在的时间是：<%=new Date() %></p>
  </body>
</html>
