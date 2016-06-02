<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!-- 这是一个html5 doctype声明 -->
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>用户登录</title>
    
</head>
<style type="text/css">
body{
	margin:0px;
	padding:0px;
	overflow:hidden;
}
#wrapper{
	position:absolute;
	width:100%;
	height:100%;
	min-width:1280px;
	min-height:680px;
	overflow-x:hidden;
	overflow-y:hidden;
    background-image: -moz-linear-gradient(top,#77D1F6, #2F368F);
    background-image: -webkit-gradient(linear, left top, left bottom, color-stop(0, #77D1F6),color-stop(1, #2F368F));
}
#header{
	height:100px;
	width:100%;
}
#logo{
	position:absolute;
	float:left;
	margin-left:5%;
	margin-top:30px;
	height:40px;
	width:160px;
	text-align:center;
}
#heading{
	position:relative;
	float:left;
	margin-left:20%;
	margin-top:-18px;
	height:110px;
	width:60%;
	border-radius: 18px;
	background-color:#1C75BC;
	opacity:0.6;
}
#heading #title{
	margin-top:40px;
	text-align:center;
	font-family:微软雅黑;
	font-size:24px;
	font-weight:bold;
}
#heading #subTitle{
	margin-top:10px;
	text-align:center;
	font-family:Courier New;
}
#main{
	margin-top:20px;
	height:500px;
	width:100%;
}
#mainBg{
	position:relative;
	float:left;
	margin-left:20%;
	margin-top:0px;
	height:500px;
	width:60%;
    border-radius: 18px;
    background-color:#000000;
    opacity:0.5;
}
#mainPanel{
    position:relative;
	margin:25px;
	height:450px;
    border-radius: 18px;
    background-image: -moz-linear-gradient(top,#EBEBEB, #BFBFBF);
    background-image: -webkit-gradient(linear, left top, left bottom, color-stop(0, #EBEBEB),color-stop(1, #BFBFBF));
}
#mainPanel #left{
	float:left;
	border-right:2px solid #F6F6F6;
	position:relative;
	top:10%;
	height:80%;
	width:49%;
	border-right-style:groove;
}
#mainPanel #image{
	position:relative;
	height:256px;
	width:256px;
	left:15%;
	top:12%;
	background-image:url('../images/admin.png');
}
#mainPanel #right{
	float:left;
	position:relative;
	height:90%;
	width:49%;
	top:5%;
}
#welcome{
	margin-top:20px;
	height:60px;
	width:100%;
	vertical-align: middle;
	display: inline-block;
	line-height: 60px;
	text-align:center;
}
#welcome #welcome-text{
	font-size:38px;
	font-weight:bold;
	font-family:微软雅黑;
	text-shadow: 0 1px 1px #F6F6F6;
}
#user-name{
	height:35px;
	width:100%;
	margin-top:20px;
	vertical-align: middle;
	display: inline-block;
	line-height: 35px;
}
#user-password{
	margin-top:20px;
	height:35px;
	width:100%;
	vertical-align: middle;
	display: inline-block;
	line-height: 35px;
}
#user-checkcode{
	margin-top:20px;
	height:35px;
	width:100%;
	vertical-align: middle;
	display: inline-block;
	line-height: 35px;
}
#button-group{
	margin-top:10px;
	height:35px;
	width:100%;
	vertical-align: middle;
	display: inline-block;
	line-height: 35px;
	text-align:center;
}
#error-tip{
	margin-top:20px;
	margin-left:5%;
	height:40px;
	width:90%;
	vertical-align: middle;
	display: inline-block;
	line-height: 35px;
	text-align:center;
	border-bottom:2px solid #F6F6F6;
	border-bottom-style:groove;
}
#error-tip #tip-text{
	font-size:18px;
	font-weight:bold;
	font-family:微软雅黑;
	color:red;
}
.item{
	margin-left:20px;
	font-family:微软雅黑;
	font-size:20px;
	font-weight:bold;
	float: left;
	width:80px;
	margin-top: 3px;
	text-align: center;
	text-shadow: 0 1px 1px #F6F6F6;
}
.input{
	vertical-align: middle;
	display: inline-block;
}
#checkcode-img{
	margin-top:3px;
	height:20px;
	width:60px;
}
.form-input{
	height:20px;
}
.btn{
    border:1px solid #cccccc;
    cursor:pointer;
    margin:10px 5px;
    height:40px;
	width:80px;
    text-align:center;
    border-radius: 4px;
    border-color: #636263 #464647 #A1A3A5;
    text-shadow: 0 1px 1px #F6F6F6;
    background-image: -moz-linear-gradient(center top, #D9D9D9, #A6A6A6 49%, #A6A6A6 50%);
    background-image: -webkit-gradient(linear, left top, left bottom, color-stop(0, #D9D9D9),color-stop(1, #A6A6A6));
}
#footer{
	margin-top:20px;
	width:100%;
}
#footer #text{
	text-align:center;
	font-size:14px;
	font-family:微软雅黑;
	font-weight:bold;
}
</style>
<body>
<div id="wrapper">
	<div id="header">
		<div id="logo"></div>
		<div id="heading">
			<div id="title">后台管理系统</div>
			<div id="subTitle">Ver 1.0</div>
		</div>
	</div>
	<div id="main">
		<div id="mainBg">
			<div id="mainPanel">
				<div id="left">
					<div id="image"></div>
				</div>
				<div id="right">
					
					<form name="loginForm" action="<%=path%>/user/User_login.action" method="post">
					<!-- start of login form -->
					<div id="welcome">
						<span id="welcome-text">管&nbsp;理&nbsp;登&nbsp;录</span>
					</div>
					<div id="user-name">
						<span class="item">用户名:</span>
						<span><input type="text" name="username" class="form-input"></span>
					</div>
					<div id="user-password">
						<span class="item">密&nbsp;&nbsp;&nbsp;码:</span>
						<span class="input"><input type="password" name="password" class="form-input"></span>
					</div>
					<div id="button-group">
						<input type="submit" class="btn" value="登录"/>
						<input type="reset" class="btn" value="重置"/>
					</div>
					<div>
					  <s:fielderror/> <!-- 显示表单验证的出错信息 -->
					</div>
					<!-- end of form -->
					</form>
					
				</div>
			</div>
		</div>
	</div>
	<div id="footer">
		<div id="text">Copyright © 2009-2015 All Rights Reserved Powered By Simoniu</div>
	</div>
</div>
</body>
</html>