function validate(){
	var name=document.forms[0].userName.value;
	var pwd=document.forms[0].userPwd.value;
	var pwd1=document.forms[0].userPwd1.value;
	var email=document.forms[0].userEmail.value;
	var accept=document.forms[0].accept.checked;
	var reg1=/[a-zA-Z]\w*/;
	var reg2=/\w+([-+.']\w+)*@\w+([-.]\w+)*.\w+([-.]\w+)*/;
	if(name.length<=0)alert("用户名不能为空！");
	else if(!reg1.test(name))alert("用户名格式不正确！");
	else if(pwd.length<6)alert("密码长度必须大于等于6！");
	else if(pwd!=pwd1)alert("两次密码不一致！");
	else if(!reg2.test(email))alert("邮件格式不正确！");
	else if(accept==false)alert("你需要仔细阅读并同意接受用户使用协议！");
	else document.forms[0].submit();
}