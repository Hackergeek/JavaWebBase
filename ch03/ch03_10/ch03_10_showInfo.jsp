<%@ page contentType="text/html" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>使用request对象获取客户端的有关信息</title>
  </head>
  <body>
    	<font color="blue">表单提交的信息：</font><br/>
    	输入的第一个数据是：<%=request.getParameter("shuju1") %><br/>
    	输入的第二个数据是：<%=request.getParameter("shuju2") %><br/>
    	<font color="red">客户端信息：</font><br/>
    	客户端协议名和版本号：<%=request.getProtocol() %><br/>
    	客户机名：<%=request.getRemoteHost() %><br/>
    	客户机的IP地址：<%=request.getRemoteAddr() %><br/>
    	客户提交信息的长度：<%=request.getContentLength() %><br/>
    	客户提交信息的方式：<%=request.getMethod() %><br/>
    	HTTP头文件中的Host值：<%=request.getHeader("Host") %><br/>
    	服务器名：<%=request.getServerName() %><br/>
    	服务器端口号：<%=request.getServerPort() %><br/>
    	接受客户提交信息的页面：<%=request.getServletPath() %><br/>
  </body>
</html>
