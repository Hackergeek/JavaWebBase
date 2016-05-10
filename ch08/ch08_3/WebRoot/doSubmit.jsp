<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>用户注册：使用EL获取用户提交数据</title>
  </head>
  <body>
  	<h2>您提交的内容如下：</h2>
  	<% request.setCharacterEncoding("UTF-8"); %>
  	姓名：${param.name}<br/>
  	性别：${param.sex}<br/>
  	外语：${param.lang}<br/>
  	电话：${param.regTelephone}<br/>
  	email：${param.email}<br/>
  	个人简介：${param.intro}<br/>
  	爱好：${paramValues.hobby[0]}${paramValues.hobby[1]}${paramValues.hobby[2]}
  </body>
</html>
