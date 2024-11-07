<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
</head>
<body>
	<pre>
<span style="color: green">${id}${success}</span>
<span style="color: red">${dto}${failure}</span>

	<h1>SignUp Form</h1>
	<form action="SignUp" method="post">
	UserId<input type="text" name="userId">value=${dto.id}>
	<br>
	Email<input type="text" name="email"> value=${dto.email}>
	<br>
	Password<input type="text" name="Password">
	<br>
	Confirm Password <input type="text" name="confirmPassword">
	<br>
	<input type="submit" value="SignUp">
	
</form>
</pre>
</body>
</html>


