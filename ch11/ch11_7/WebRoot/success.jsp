<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>评论成功</title>
  </head>
  <body>
  	评论如下：<hr>
  	评论标题：<s:property value="title"/><br>
  	评论内容：<s:property value="content"/>
  </body>
</html>
