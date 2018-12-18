<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登陆页面</title>

<style type="text/css">
        html {
	    min-height: 100%; 
	    /*你需要设置这个参数，确保渐变效果填满整个页面，不会被切断*/
}
        body{
         		padding: 0;
                margin: 0 auto;
        
        background: -webkit-linear-gradient(#d0c5e1, #ebe6f0); 
	    /* Opera 11.1+ */
	    background: -o-linear-gradient(#d0c5e1, #ebe6f0); 
	    /* Firefox 3.6+ */
	    background: -moz-linear-gradient(#d0c5e1, #ebe6f0); 
	    /* 标准语法（一定要放在最后）*/
	    background: linear-gradient(#d0c5e1, #ebe6f0); 
	    /*最好设置一个背景颜色，万一渐变效果加载失败，背景也不会是空白的*/
	    background-color: #d0c5e1; 
        }
        </style>    


</head>
<body>
<form action="liginaction2.action" method="post">
	<h2>用户登录</h2>
	用户名：<input name="user.username" type="text"> <br>
	密码：<input name="user.userpass" type="password"> <br> <br>
	<input type="reset" value="重置">
	<input type="submit" value="提交">
</form>
</body>
</html>


