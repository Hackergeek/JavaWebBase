<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>登录处理</title>
  </head>
  
  <body>
  	<%
  		String userName = request.getParameter("username");	//获取用户名
  		if(userName != null) {
  			Cookie c = new Cookie("username", userName);	//创建Cookie对象，名称为username
  			c.setMaxAge(30*24*60);	//设置Cookie有效期为30天
  			response.addCookie(c);	//将Cookie对象保存到客户端
  			session.setAttribute("username", userName);	//将用户名存到session范围内用于权限检查
  			response.sendRedirect("main.jsp");	//重定向到主页面
  		}
  	 %>
  </body>
</html>
