<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>校验成功</title>
  </head>
  <body>
  	校验通过，用户信息如下：
  	<hr>
  	用户名：<s:property value="user.userName"/><br>
  	密码：<s:property value="user.userPwd"/><br>
  	确认密码：<s:property value="userPwd"/><br>
  	性别：<s:property value="user.userSex"/><br>
  	邮箱地址：<s:property value="user.userEmail"/><br>
  	基本情况：<s:property value="user.userBasicInfo"/>
  </body>
</html>
