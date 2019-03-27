<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is a title</title>
</head>
<body>
<form action="/login" method="post">
<p><font color="red">${errorMessage}</font><p/>
Enter your name <input type="text" name="user"/> and password <input type="password" name="pass"/>  <input type="submit" value="login"/>
</form>
</body>
</html> 