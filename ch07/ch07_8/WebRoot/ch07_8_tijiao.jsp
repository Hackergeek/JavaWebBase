<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>提交任意2个整数给Servlet的页面</title>
  </head>
  <body>
  	<h3>按下列格式要求，输入两个整数数据：</h3>
  	<form action="Servlet_yunsuan" method="post">
  		开始数据：<input name="shuju1"><br>
  		结束数据：<input name="shuju2"><br>
  		<input type="submit" value="提交">
  	</form>
  </body>
</html>
