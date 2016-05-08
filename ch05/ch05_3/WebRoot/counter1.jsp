<%@ page contentType="text/html" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>网页访问数量</title>
  </head>
  <body>
    <jsp:useBean id="counter" scope="application" class="beans.Counter"></jsp:useBean>
   	 这次访问的是第1个页面：counter1.jsp!<br>
 	两页面共被访问次数：
 	<jsp:getProperty property="count" name="counter"/>
  </body>
</html>
