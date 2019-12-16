<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  发起图书请求，使用rest风格的url地址
GET 查询
DELETE 删除
PUT 更新
POST 添加
 -->
<a href="book/1"> 查询图书</a>
<form action="book/1" method="post">
	<input type="submit" value="添加图书"/>
</form>
<form action="book/1" method="post">
	<input name="_method" value="delete">
	<input type="submit" value="删除"/>
</form>
<form action="book/1" method="post">
	<input name="_method" value="put">
	<input type="submit" value="更新图书"/>
</form>

</body>
</html>