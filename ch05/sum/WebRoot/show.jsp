<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>利用JavaBean+JSP求两数和</title>
  </head>
  <body>
  	<jsp:useBean id="c" class="beans.Add" scope="request"></jsp:useBean>
  	<jsp:setProperty property="*" name="c"/>
  	<p>调用jsp:getProperty作标签显示结果值：<br>
  		<jsp:getProperty property="shuju1" name="c"/>+
  		<jsp:getProperty property="shuju2" name="c"/>=
  		<jsp:getProperty property="sum" name="c"/>
  	</p>
  </body>
</html>
