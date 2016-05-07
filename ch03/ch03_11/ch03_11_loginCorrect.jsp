<%@ page contentType="text/html" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>成功登入页面</title>
  </head>
  <body>
    	<% String name = request.getParameter("RdName"); %>
    	欢迎，<%=name %>成功登录！
  </body>
</html>
