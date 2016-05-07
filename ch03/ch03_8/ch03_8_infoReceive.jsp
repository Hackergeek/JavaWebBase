<%@ page contentType="text/html" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>采用getParammeterNames()方法获得参数并显示参数值</title>
  </head>
  <body>
    <% 
    	String current_param="";
    	String current_val="";
    	request.setCharacterEncoding("UTF-8");
    	Enumeration params = request.getParameterNames();
    	while(params.hasMoreElements()) {
    		current_param = (String)params.nextElement();
    		current_val = request.getParameter(current_param);
    		%>参数名称：<%=current_param %>参数值：<%=current_val %><br/>
      <%}%>
  </body>
</html>
