<%@ page contentType="text/html" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>简单的网上试题自动评测——评测</title>
  </head>
  <body>
    <%
    	String s1 = request.getParameter("r1");
    	if(s1 != null) {
    		out.println("一、解答为：2+3=" + s1 +" ");
    		if(s1.equals("5")) {
    			out.println("正确！<br>");
    		} else {
    			out.println("错误！" + "<br>");
    		}
    	} else {
    		out.println("一、没有解答！");
    	}
    	out.println("----------------------<br>");
    	
    	String[] s2 = request.getParameterValues("c1");
    	if(s2 != null) {
    		out.println("二、解答为：偶数有：");
    		for(int i = 0; i < s2.length; ++i) {
    			out.println(s2[i] + " ");
    		}
    		if(s2.length == 2 && s2[0].equals("2") && s2[1].equals("4")) {
    			out.println("正确！<br>");
    		} else {
    			out.println("错误！" + "<br>");
    		}
    	} else {
    		out.println("二、没有解答！");
    	}
    	out.println("----------------------<br>");
    	
    	String[] s3 = request.getParameterValues("list1");
    	if(s3 != null) {
    		out.println("三、解答为：动态网页有：");
    		for(int i = 0; i < s3.length; ++i) {
    			out.println(s3[i] + " ");
    		}
    		if(s3.length == 3 && s3[0].equals("asp") && s3[1].equals("php") && s3[2].equals("jsp")) {
    			out.println("正确！<br>");
    		} else {
    			out.println("错误！" + "<br>");
    		}
    	} else {
    		out.println("三、没有解答！");
    	}
    	out.println("----------------------<br>");
    	
    	String s4 = request.getParameter("list2");
    	if(s4 != null) {
    		out.println("四、解答为：服务器端的组件有：");
    		out.println(s4+ " ");
    		if(s4 != null && s4.equals("servlet")) {
    			out.println("正确！<br>");
    		} else {
    			out.println("错误！" + "<br>");
    		}
    	} else {
    		out.println("四、没有解答！");
    	}
    	out.println("----------------------<br>");
    	
    	String s5 = request.getParameter("text1");
    	if(s5 != null) {
    		out.println("五、解答为：");
    		out.println(s5+ " ");
    		if(s5 != null && s5.equals("request")) {
    			out.println("正确！<br>");
    		} else {
    			out.println("错误！" + "<br>");
    		}
    	} else {
    		out.println("五、没有解答！");
    	}
    	out.println("----------------------<br>");
     %>
  </body>
</html>
