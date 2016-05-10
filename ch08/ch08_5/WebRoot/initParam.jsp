<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>EL initParam对象</title>
  </head>
  <body>
  	<b>web应用上下文初始参数：</b><p>
  	<!-- 下面两行输出同样结果 -->
  	<%=application.getInitParameter("book") %><br/>
  	${initParam[book]}</p>
  </body>
</html>
