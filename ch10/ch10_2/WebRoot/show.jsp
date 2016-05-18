<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<html>
  <head>
    <title>显示公告内容</title>
  </head>
  
  <body>
  	<%request.setCharacterEncoding("UTF-8"); %>
  	${param.newsBody}
  </body>
</html>
