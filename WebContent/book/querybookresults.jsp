<%@page import="minilib.vo.title"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    import ="java.util.*"
    import ="minilib.vo.title.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书列表</title>
</head>
<body>

<table width="100%" border="0" cellspace="1" cellpadding="0" class="">
		<tr bgcolor="#fba661" height="25">
			<td width=10% bgcolor="#fba661">
				<div align="center">ISBN</div>
			</td>
			<td width=13% bgcolor="#fba661">
				<div align="center">书名</div>
			</td>
			<td width=12% bgcolor="#fba661">
				<div align="center">作者</div>
			</td>
			<td width=13% bgcolor="#fba661">
				<div align="center">出版社</div>
			</td>
		</tr>
		<% 
		List list=(List)request.getAttribute("alltitlelist");
		Iterator its=list.iterator();
		while(its.hasNext()){
			title t=new title();
			t=(title)its.next();
		%>
		<tr bgcolor="#fba661" height="25">
			<td width=10% bgcolor="#fba661">
				<div align="center">
					<%=t.getIsbn() %>
				</div>
			</td>
			<td width=13% bgcolor="#fba661">
				<div align="center">
					<%=t.getTitle()%>
				</div>
			</td>
		</tr>
			<% 	}	%>

</table>

</body>
</html>