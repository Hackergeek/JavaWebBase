<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<html>
<head>
<title>提交数据页面，并根据不同的按钮选择不同的业务处理</title>
<script type="text/javascript">
	function sub() {
		document.form.action="sub";
	}
	
	function mul() {
		document.form.action="mul";
	}
	
	function div() {
		document.form.action="div";
	}
</script>
</head>

<body>
	<form action="add" method="post" name="form">
		请输入两个整数：<br><br>
		第一个运算数：<input type="text" name="x"/><br><br>
		第二个运算数：<input type="text" name="y"/><br><br>
		<input type="submit" value="求和"/>
		<input type="submit" value="求差" onclick="sub()"/>
		<input type="submit" value="求积" onclick="mul()"/>
		<input type="submit" value="求商" onclick="div()"/>
	</form>
	<br>
</body>
</html>
