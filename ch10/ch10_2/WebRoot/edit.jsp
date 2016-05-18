<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
<title>编辑公告内容</title>
<script type="text/javascript" src="ckeditor/ckeditor.js"></script>
</head>

<body>
	<center>
		编辑公告内容
		<form action="show.jsp" method="post">
			<textarea rows="10" cols="80" name="newsBody" class="ckeditor"></textarea>
			<input type="submit" value="显示公告内容" />
		</form>
	</center>
	<br>
</body>
</html>
