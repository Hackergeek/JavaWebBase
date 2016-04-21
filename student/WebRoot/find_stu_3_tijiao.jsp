<%@page language="java" pageEncoding="UTF-8" %>
<%request.setCharacterEncoding("UTF-8"); %>
<html>
	<head><title>查询条件提交页面</title></head>
	<body>
		请选择查询条件<hr width="100%" size="3">
		<form action="find_stu_3.jsp" method="post">
			性别： 男<input type="radio" value="男" name="sex" checked="checked">
			女<input type="radio" value="女" name="sex" ><br><br>
			体重范围：<p>&nbsp;&nbsp;&nbsp;&nbsp;
			最小<input type="text" name="w1" value="0"> <br><br>
			&nbsp;&nbsp;&nbsp;&nbsp;
			最大<input type="text" name="w2" value="150"></p>
			<input type="submit" value="提 交">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="reset" value="取 消">
		</form>
	</body>
</html>