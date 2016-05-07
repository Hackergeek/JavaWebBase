<%@ page contentType="text/html" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>out的使用</title>
  </head>
  <body>
    	利用out对象输出的页面信息：<br>
    	<hr>
    	<% 	
    		out.print("aaa<br/>bbb"); 
			out.print("<br/>用户名或密码不正确，请重新<a href='http://sohu.com'><font size='15' color='red'>登录</font></a>");
			out.print("<br><a href='javascript:history.back()'>后退</a>......");   	
    	%>
  </body>
</html>
