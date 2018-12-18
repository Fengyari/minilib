<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <html xmlns="http://www.w3.org/1999/xhtml">
 
<head>
<title>折叠菜单</title>

<script language = JavaScript>
function showmenu(id) {
var list = document.getElementById("list"+id);
var menu = document.getElementById("menu"+id)
if (list.style.display=="none") {
document.getElementById("list"+id).style.display="block";
menu.className = "title1";
}else {
document.getElementById("list"+id).style.display="none";
menu.className = "title";
}
}
</script>

<style type="text/css">
<!-- 
*{margin:0;padding:0;list-style:none;font-size:14px}
#nav{margin:10px;text-align:center;line-height:25px;width:200px;}
.title{background:#9d8fb4;color:#fff;border-bottom:1px solid #fff;cursor:pointer;}
.title1{background:#888;color:#000;border-bottom:1px solid #666;cursor:pointer;}
.content li{color:#9d8fb4;background:#ddd;border-bottom:1px solid #fff;}
-->
 html {
	    min-height: 100%; 
	    /*你需要设置这个参数，确保渐变效果填满整个页面，不会被切断*/
}
        body{
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
<div id="nav">
<div class="title" id="menu1" onclick="showmenu('1') ">图书管理</div>
<div id="list1" class="content" style="display:none">
<ul>
<li><a href="findBookTypemanageTitleAction.action" target="content">增加图书</a></li>
<li><a href="../book/querybook.jsp" target="content">查询图书</a></li>
</ul>
</div>
<div class="title" id="menu2" onclick="showmenu('2')">书目管理</div>
<div id="list2" class="content" style="display:none">
<ul>
<li>菜单导航</li>
<li>层和布局</li>
<li>图片切换</li>
</ul>
</div>
<div class="title" id="menu3" onclick="showmenu('3')">借阅管理</div>
<div class="title" id="menu4" onclick="showmenu('4')">领导功能</div>
<div class="title" id="menu5" onclick="showmenu('5')">读者功能</div>
<div class="title" id="menu6" onclick="showmenu('6')">用户管理</div>
</div>
</body>
</html>