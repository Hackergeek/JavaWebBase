<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>评论</title>
  </head>
  <body>
  	请发表你的评论！<hr>
  	<s:form action="public" method="post">
  		<s:textfield name="title" label="评论标题" maxLength="36"/>
  		<s:textarea name="content" label="评论内容" cols="36" rows="6"/>
  		<s:submit value="提交"/>
  	</s:form>
  </body>
</html>
