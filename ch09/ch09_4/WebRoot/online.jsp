<%@page import="listener.OnlineListener"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>在线人数显示页面</title>
  </head>
  <body>
  	<h2>当前在线人数：<%=OnlineListener.getOnlineCount() %></h2>
  </body>
</html>
