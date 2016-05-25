<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<title></title>
</head>
<body>
	<table align="center">
		<tr height="200">
			<td align="center">
				<h1>基于Struts2+Hibernate的学生信息管理系统实例，可对学生信息进行增、删、改、查！</h1>
			</td>
		</tr>
		<tr>
			<td align="center">
				<a href="<%=path%>/student/addMessage.jsp">
					<h1>
						<u>点击进入</u>
					</h1>
				</a>
			</td>
		</tr>
	</table>
</body>
</html>

