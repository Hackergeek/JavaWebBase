<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>显示页面——代数和为非负整数</title>
</head>
<body>
	代数和为非负整数：<s:property value="sum"/><br>
	加数：<s:property value="#request.x"/><br>
	被加数：<s:property value="#session.y"/><br>
	和值：<s:property value="#application.sum"/><br>
</body>
</html>
