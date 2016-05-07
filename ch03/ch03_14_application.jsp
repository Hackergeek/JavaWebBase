<%@ page contentType="text/html" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>统计网站访问人数及其当前在线人数</title>
  </head>
  <body>
    	<%! Integer yourNumber = new Integer(0); %>
    	<% if(session.isNew()) {	//如果是一个新的会话
    			Integer number = (Integer) application.getAttribute("Count");
    			if(number == null) {	//如果是第一个访问本站
    				number = new Integer(1);
    			} else {
    				number = new Integer(number.intValue() + 1);
    			}
    			application.setAttribute("Count", number);
    			yourNumber = (Integer) application.getAttribute("Count");
    		}
    	%>
    	欢迎访问本站，你是第<%=yourNumber %>个访问用户。
  </body>
</html>
