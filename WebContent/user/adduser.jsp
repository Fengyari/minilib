<%@ page language="java" contentType="text/html; charset=utf-8"

	import ="java.util.*"
	import ="minilib.vo.user"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加图书</title>

 <style type="text/css">
        html {
	    min-height: 100%; }
		 #footer {
                height: 40px;
                line-height: 40px;
                position: fixed;
                bottom: 0;
                width: 100%;
                text-align: center;
                background: #333;
                color: #fff;
                font-family: Arial;
                font-size: 12px;
                letter-spacing: 1px;     }
        body{
         		padding: 0;
                margin: 0 auto;     
        background: -webkit-linear-gradient(#d0c5e1, #ebe6f0); 
	    background: -o-linear-gradient(#d0c5e1, #ebe6f0); 
	    background: -moz-linear-gradient(#d0c5e1, #ebe6f0); 
	    background: linear-gradient(#d0c5e1, #ebe6f0); 
	    background-color: #d0c5e1;         }
        </style>    

</head>
<body>
${message}
<form action="addusermanageuserAction.action" method="post">
图书类别：
<select name="user.flag">
	<!-- 
	//循环requestScope.alltypelist 
	--当前条目的变量名为：booktype
	--循环状态为status（状态）
	--取到request里面的一个叫alltypelist的集合（该集合在action.findBookType（）方法中被创建.）            ？？服务器？
	--<option>定义下拉列表中的一个选项（一个条目）
	-->
	
	<c:forEach items="${requestScope.alltypelist}" var = "booktype" varStatus="status">
	<option value="${booktype.codeid}">${booktype.codename}</option>
	</c:forEach>
</select><br>
书名：
<input type="text" name="book.title">
<br>
<input type="submit" name="submit" value="增加图书">
</form>
</body>
</html>