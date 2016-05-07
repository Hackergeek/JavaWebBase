<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>接受参数页面</title>
  </head>
  <body>
    	接受参数，并显示结果页面。<br/>
    	<%String str=request.getParameter("userName"); %>
    	<font color="blue" size="12"><%=str %></font>你好，欢迎你访问！
  </body>
</html>
