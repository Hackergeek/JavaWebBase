<!-- 这部分是JSP代码，称为JSP指令 -->
<%@ page contentType="text/html" import="java.util.*" pageEncoding="UTF-8"%>

<html>
  <head>
    <title>一个简单的JSP程序示例</title>
  </head>
  <body>
    	<%!int sum = 0, x = 1; %>
    	
    	<!-- 这部分是JSP代码，称为JSP脚本 -->
    	<% while(x <= 10) {
				sum += x; ++x;    	
    		} 
    	%>
    	
    	<h3>该程序的功能是计算1到10的累加和，并显示运行时间！</h3>
    	
    	<!-- 这部分称为JSP表达式 -->
    	<p>1加到10的结果是：<%=sum %></p>
    	<p>程序的运行日起是：<%=new Date() %></p>
  </body>
</html>
