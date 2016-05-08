<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>提交数据页面</title>
  </head>
  <body>
    <form method="post" action="calculate">
    	请输入第一个复数的实部：<input type="text" name="r1"/><br>
    	请输入第一个复数的虚部：<input type="text" name="i1"/><br>
    	选择运算类型
    	<select name="oper">
    		<option>+</option>
    		<option>-</option>
    		<option>*</option>
    		<option>/</option>
    	</select><br>
    	请输入第二个复数的实部：<input type="text" name="r2"/><br>
    	请输入第二个复数的虚部：<input type="text" name="i2"/><br>
    	<input type="submit" value="计算"/>
    </form>
  </body>
</html>
