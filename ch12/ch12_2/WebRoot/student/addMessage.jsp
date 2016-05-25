<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="学生信息管理系统-增加" /></title>
</head>
<body bgcolor="pink">
	<s:div align="center">
		<s:include value="../menu.jsp">
			<s:param name="oper">2</s:param>
		</s:include>
		<center>
			<font color="red" size="6">添加学生信息</font>
		</center>
	</s:div>
	<s:form action="addMessageAction" method="post">
		<table align="center" width="30%" bgcolor="gray" border="5">
			<tr>
				<td><s:textfield name="student.id" label="学号" maxLength="16"></s:textfield></td>
				<td><s:textfield name="student.name" label="姓名" maxLength="16" /></td>
				<td><s:select name="student.sex" label="性别" list="{'男','女'}" /></td>
				<td><s:textfield name="student.age" label="年龄" /></td>
				<td><s:textfield name="student.weight" label="体重" /></td>
				<td colspan="2"><s:submit value="提交" /> <s:reset value="清除" />
				</td>
			</tr>
		</table>
	</s:form>
</body>