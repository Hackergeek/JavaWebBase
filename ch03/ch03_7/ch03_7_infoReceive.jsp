<%@ page contentType="text/html" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>采用getParameter()获得参数并显示参数值</title>
  </head>
  <body>
    	<%
    		request.setCharacterEncoding("UTF-8");
    		String rdName=request.getParameter("rdName");
    		String phName=request.getParameter("phName");
    	 %>
    	 <font face="楷体" size="4" color="blue">
    	 你输入的信息为：<br/>
    	 姓名：<%=rdName %><br/>
    	电话：<%=phName %><br/>
    	 </font>
  </body>
</html>
