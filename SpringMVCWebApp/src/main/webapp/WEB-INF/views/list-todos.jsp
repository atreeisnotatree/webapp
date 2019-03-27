<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"rel="stylesheet">
<meta charset="ISO-8859-1">
</head>
<title> Your todo's</title>
<body>
<div class="container">
Hi ${user} <br>

<div>
		<table class="table table-striped">
			<caption>Your Todos are</caption> 

			<thead>
				<tr>
					<th>Description</th>
					<th>Date</th>
					<th>Completed</th>
					<th></th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.desc}</td>
						<td>${todo.targetDate}</td>
						<td>${todo.done}</td>
						<td><a href="/update-todo?id=${todo.id}" class="btn btn-success">Update</a></a></td>
						<td><a href="/delete-todo?id=${todo.id}" class="btn btn-danger">Delete</a></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</br>
<div></div>
<a class="btn btn-success" href="/add-todo">Add</a>
</div>
</div>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>