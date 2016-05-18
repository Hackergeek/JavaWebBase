<%@ page  pageEncoding="utf-8" import="java.util.*,bean.Student"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<html>
  <body>
   	显示结果(用EL和JSTL)<br/>
   <table border="1">
    <tr><th>学号</th><th>姓名</th><th>性别</th></tr>
    <c:forEach var="student" items="${result}">
       <tr><td>${student.sno}</td><td>${student.sname}</td><td>${student.sex}</td></tr>
    </c:forEach>
   </table>
   <hr/>查询显示结果(用代码)<br/>
   <% List<Student> studentlist=(List<Student>)request.getAttribute("result"); %>
   <table border="1">
    <tr><th>学号</th><th>姓名</th><th>性别</th></tr>
     <%  for(Student student:studentlist){%>
           <tr><td><%=student.getSno()%></td>
           <td><%=student.getSname()%></td>
           <td><%=student.getSex()%></td></tr>
    <%} %>
   </table>
    </body>
</html>
