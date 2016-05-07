<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>提交任意2个整数的页面</title>
  </head>
  <body>
   	<h3>按下列格式要求，输入两个整数：</h3><br>
   	<form action="show.jsp" method="post">
   	加数：<input name="shuju1"><br><br>
   	被加数：<input name="shuju2"><br><br>
   	<input type="submit" value="提交">
   	</form>
  </body>
</html>
