<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
<title>主页面</title>
</head>
<body>
	<%
		String userName = (String) session.getAttribute("username");
		if (userName == null) {
			//session中用户名为空说明用户没有登录
			Cookie[] cs = request.getCookies();
			String v = null;
			if (cs != null) {
				for (int i = 0; i < cs.length; i++) {//获取名称为username的Cookie对象值
					if (cs[i].getName().equals(userName)) {
						v = cs[i].getValue();
					}
					out.print(v +  "1");
				}
			}
			if (v != null) {//Cookie值不空，自动登录成功
				session.setAttribute("username", v);
				out.println(v + ",您好");
			} else {//自动登录失败，转到登录页面
				out.print("您还没注册，2秒后转到注册页面");
				response.setHeader("Refresh", "2;url=login.jsp");
			}
		} else { //session中用户名不空说明用户已经登录
			out.print("3734");
			out.println(userName + ",您好");
		}
	%>
</body>
</html>
