<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>注册页面</title>
    <style type="text/css">
    	body{font-size:12px;}
    	#title{color:#FF7B0B;font-size:20px;font-weight:bold;}
    	.td{height:30px;}
    	.info{color:#BBBBBB;}
    </style>
    <script type="text/javascript">
    	function check(frm) {
    		if(frm.accept.checked == false) {
    			alert("你需要仔细阅读用户使用协议，并同意接受协议！");
    			return false;
    		}
    		return true;
    	}
    </script>
  </head>
  <body>
  	<s:fielderror cssStyle="color:red"></s:fielderror>
  	<s:form action="register" method="post" theme="simple" onsubmit="return check(this)">
  		<table border="0" align="center" width="580">
  			<tr>
  				<td colspan="3" align="center" height="40" id="title">填写注册信息</td>
  			</tr>
  			<tr>
  				<td align="right">用户名：*</td>
  				<td><s:textfield name="user.userName"/></td>
  				<td class="info">用户名由字母开头，后跟字母、数字或下划线！</td>
  			</tr>
  			<tr>
  				<td align="right">密码：*</td>
  				<td><s:password name="user.userPwd"/></td>
  				<td class="info">设置登录密码，至少6位！</td>
  			</tr>
  			<tr>
  				<td align="right">确认密码：*</td>
  				<td><s:password name="userPwd"/></td>
  				<td class="info">请再输入一次你的密码！</td>
  			</tr>
  			<tr>
  				<td align="right">性别：*</td>
  				<td><s:radio name="user.userSex" list="{'男','女'}"/></td>
  				<td class="info">请选择你的性别！</td>
  			</tr>
  			<tr>
  				<td align="right">邮箱地址：*</td>
  				<td><s:textfield name="user.userEmail"/></td>
  				<td class="info">请填写您的常用邮箱，可以用此邮箱找回密码！</td>
  			</tr>
  			<tr>
  				<td align="right" valign="top">基本情况：*</td>
  				<td colspan="2"><s:textarea name="user.userBasicInfo" rows="5" cols="50"/></td>
  			</tr>
  			<tr>
  				<td colspan="3" align="center" height="40">
  					<s:checkbox name="accept" value="false">我已经仔细阅读并同意接受用户使用协议</s:checkbox>
  				</td>
  			</tr>
  			<tr>
  				<td colspan="3" align="center" height="40">
  					<input type="submit" value="确认"> &nbsp;
  					<input type="reset" value="取消">
  				</td>
  			</tr>
  		</table>
  	</s:form>
  </body>
</html>
