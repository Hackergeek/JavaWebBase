<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>发送文本格式的邮件</title>
  </head>
  <body>
  	<h1 align="center">发送文本格式的邮件</h1>
  	<form action="sendmail" method="post">
  		<table border="1" align="center" cellspacing="1">
  			<tr>
  				<td width="20%" height="30">收信人地址：</td>
  				<td width="80%" height="30"><input type="text" size="40" name="to"/></td>
  			</tr>
  			<tr>
  				<td height="30">标题：</td>
  				<td height="30"><input type="text" size="40" name="title"/></td>
  			</tr>
  			<tr>
  				<td height="30">邮件内容：</td>
  				<td height="30"><textarea cols="60" rows="20" id="content" name="content"></textarea>  </td>
  			</tr>
  			<tr align="center">
  				<td colspan="2" height="40">
  					<input type="submit" value="发送">&nbsp;&nbsp;
  					<input type="reset" value="重输">
  				</td>
  			</tr>
  		</table>
  	</form>
  </body>
</html>
