<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
  	<!-- 使用text标签输出国际化消息 -->
    <title><s:text name="title.login"/></title>
  </head>
  <body>
  	<s:form action="checkLogin" method="post">
  		<!-- 表单元素的key值与资源文件的key对应 -->
  		<s:textfield name="name" key="label.username" size="20"/>
  		<s:password name="password" key="label.password" size="22"/>
  		<s:submit key="item.submit"/>
  	</s:form>
  </body>
</html>
