<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>ALL FOOD ITEMS</title>

<style type="text/css">
table, td {
	text-align: center;

}
h2{
	font-family: "Times New Roman";
}
h3{
	font-family: "Times New Roman";
}
</style>
</head>
<body>
	<div align="center">
		<h2 >Le Gourmet Food Center</h2>
		<hr>
		<h3>
			<a href="/create">Create New Food Item</a>
			<br>
			<br>
		</h3>
		<table border="2" width="70%" cellpadding="2" 
			style="margin-left: auto; margin-right: auto;">
			<tr>
				<th>ITEMNUMBER</th>
				<th>ITEMNAME</th>
				<th>CUISINE</th>
				<th>PRICE</th>
				<th>AVIALABILITY</th>
				<th>ACTIONS</th>
			</tr>
			<c:forEach var="item" items="${fooditems}">
				<tr>
					<td>${item.itemNumber}</td>
					<td>${item.itemName}</td>
					<td>${item.cuisine}</td>
					<td>${item.price}</td>
					<td>${item.availability}</td>
					<td><a href="/editItem?itemNumber=${item.itemNumber}"
						class="btn btn-sm btn-primary">Edit</a> &nbsp; &nbsp; <a
						href="/delete?itemNumber=${item.itemNumber}" class="btn btn-sm btn-danger">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>