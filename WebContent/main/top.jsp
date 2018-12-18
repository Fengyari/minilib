<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html>
    <head>
        <meta charset="utf-8" />
        <title>图书管理页面</title>
        <style type="text/css">
        html {
	    min-height: 100%; 
	    /*你需要设置这个参数，确保渐变效果填满整个页面，不会被切断*/
}
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
                letter-spacing: 1px;
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
   
   	<div id="footer">冯雅茹@2018-12-3 </div>
   	
        <!--  <frameset >
				<frame rows="30px" name="content" src="foot.jsp" />
        </frameset>   -->
	</body>
</html>
