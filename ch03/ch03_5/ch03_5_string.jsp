<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>传参数页面</title>
  </head>
  <body>
    	<h4>该页面传递一个参数QQ，直线下是接受参数页面的内容</h4>
    	<hr>
    	<jsp:include page="ch03_5_output.jsp">
    		<jsp:param value="QQ" name="userName"/>
    	</jsp:include>
  </body>
</html>
