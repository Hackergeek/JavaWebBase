<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<html>
  <head>
    <title>计算1到100之间的整数和值的JSP程序</title>
  </head>
  <body bgcolor="#00ff00">
  	<font size="5">这是一个单纯的jsp页面编程示例<br>
  		<%
  			int i, sum = 0;
  			for(i = 1; i <= 100; i++) {
  				sum += i;
  			}
  		 %>
  		 1到100的和为：<%=sum %>
  	</font>
  </body>
</html>
