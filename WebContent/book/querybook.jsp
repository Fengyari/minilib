<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询图书</title>

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
<!-- <div style="margin:0 auto; width: 2px;"> -->
<form action="querybyauthmanageTitleAction.action" method="post">
<!-- 按作者名查找 -->
	<b>按作者名查找:</b>
	<input type="text" name="book.authors" >
	<input type="submit" value="查询图书">
</form>
<br>

<form action="querybookbttitlemanageTitleAction.action" method="post">
<!-- 按书名查找 -->
	<b>按书名查找:</b>
	<input type="text" name="book.title" >
	<input type="submit" value="查询图书">
</form>
<br>

<!-- 设置第二个表单，提交查询时跳转到findall函数，函数最后的返回值alltitlelist不同，返回到querybookresult页面输出的值就改变-->
<form action="findalltitlesmanageTitleAction.action" method="post">
	<b>显示所有图书:</b>
	<input type="submit" value="查询">
</form>

</body>
</html>