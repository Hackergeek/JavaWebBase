<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<html>
<head>
<title>上传页面</title>
</head>

<body>
	<form method="post" action="upload" enctype="multipart/form-data">
		<input type="file" name="file2" contenteditable="false" onclick="info.innerHTML=''"/><br>
		<input type="file" name="file1" contenteditable="false" onclick="info.innerHTML=''"/><br>
		<input type="submit" value="上传">
	</form>
	<div id="info">${message}</div>
</body>
</html>
