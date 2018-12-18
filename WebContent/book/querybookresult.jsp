<%@ page language="java" contentType="text/html; charset=UTF-8"
	import ="java.util.*"
	import ="minilib.vo.title"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示图书列表</title>
</head>
<body>
	<table width="100%" border="0" cellspacing="1" cellpadding="0" class="">
		<tr bgcolor="#fba661" height="25">
			<td width="10%" bgcolor="#fba661">
					<div align="center">
					书号
					</div>
			</td>
			<td width="10%" bgcolor="#fba661">
					<div align="center">
					ISBN
					</div>
			</td>
			<td width="10%" bgcolor="#fba661">
					<div align="center">
					作者
					</div>
			</td>
			<td width="10%" bgcolor="#fba661">
					<div align="center">
					书名
					</div>
			</td>
			<td width="10%" bgcolor="#fba661">
					<div align="center">
					出版社
					</div>
			</td>
		</tr>
		<c:forEach items="${requestScope.alltitlelist}" var="title" varStatus="status">
			<tr bgcolor="#f3f3f3" height="25">
				<td width="10%">
					<div align="center">
					${title.bookid}
					</div>
				</td>
				<td width="10%">
					<div align="center">
						${title.isbn}
					</div>
				</td>
				<td width="10%">
					<div align="center">
						${title.authors}
					</div>
				</td>
				<td width="10%">
					<div align="center">
						${title.title}
					</div>
				</td>
				<td width="10%">
					<div align="center">
						${title.pressid}
					</div>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>