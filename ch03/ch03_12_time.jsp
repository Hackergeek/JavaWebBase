<%@ page contentType="text/html" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>页面自动刷新时间</title>
  </head>
  <body>
    	当前时间是：<%=new Date().toLocaleString() %><br>
    	<hr>
    	<% response.setHeader("refresh", "1"); %>
  </body>
</html>
