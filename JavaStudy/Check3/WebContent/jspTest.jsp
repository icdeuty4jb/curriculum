<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test</title>
</head>
<body>

<%@ include file="header.jsp"%>
<!-- name、idの入力エリアを作成しなさい -->
<div style="padding-top: 50px; padding-bottom: 50px;">
<table>
	<tr>
		<th>name</th>
		<td><label for="name" class="name"><input type="text" name="username"></label></td>
	</tr>

	<tr>
		<th>id</th>
		<td><label for="id" class="id"><input type="text" name="id"></label></td>
	</tr>
</table>
</div>

<%@ include file="footer.jsp"%>


</body>
</html>

