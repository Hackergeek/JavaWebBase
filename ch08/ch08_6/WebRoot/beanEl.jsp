<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>使用EL访问JavaBean属性</title>
  </head>
  <body>
  	<jsp:useBean id="bookBean" class="beans.BookBean" scope="session"></jsp:useBean>
  	<%	//通过常规方法访问JavaBean的属性
  		int BId = bookBean.getBookId();
  		bookBean.setBookId(1002);
  		String BName = bookBean.getBookName();
  		bookBean.setBookName("Java Web应用开发技术与案例教程");
  	 %>
  	 <!-- 通过EL存取运算符访问JavaBean的属性 -->
  	 书号：${bookBean.bookId}<br/>
  	 书名：${bookBean.bookName}<br/>
  	 作者：${bookBean.author}<br/>
  	 出版社：${bookBean["publisher"]}<br/>
  	 价格：${bookBean.price}<br/>
  </body>
</html>
