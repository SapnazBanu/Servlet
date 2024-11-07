<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>x-workz</title>
</head>
<body>
	<span style="color: green"> ${Name} ${success}
		${totalCost} <span style="color: red">${valid} ${failure}
			${value}

			<h1>Home page</h1>
			<form action="submit" method="post">
				<pre>

stadiumName<select name="stadiumName" value=${dto.stadiumName}>
			<option>select</option>
            <option>Eden gardens</option>
            <option>Chinnaswamy Stadium</option>
            <option>pune stadium</option>
            <option>jawaharlal Nehru stadium</option>
            </select>
Ticket<input type="text" name="ticket" value=${dto.Ticket}>
Contact<input type="text" name="contact" value=${dto.Contact}>
Email<input type="text" name="email" value=${dto.email}>		

<input type="submit" value="book">   
</pre>
<span style="color:black">${dto}
</form>

</body>
</html>
</body>
</html>