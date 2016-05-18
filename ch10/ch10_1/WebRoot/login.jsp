<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<html>
  <head>
    <title>带图形验证码的登录</title>
  </head>
  <body>
  <form name="form" method="post">
  	用户名<input type="text" name="userid" onclick="mes.innerHTML=''" ><br/>
  	密码<input type="password" name="userpwd" /><br/>
  	验证码<input type="text" name="checkcode"/>
  	<img border="0" src="checkcode"/>
  	<input type="submit" value="换一张" onclick="form.action='changecheckcode'"/><br/>
  	<input type="submit" value="登录" onclick="form.action='logincheck'"/>
  	<input type="reset" value="重置"/>
  	<div id="mes">${info}</div>	
  </form>
  </body>
</html>
