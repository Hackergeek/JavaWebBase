<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
  response.sendRedirect(path+"/user/User_login.jsp");
%>
