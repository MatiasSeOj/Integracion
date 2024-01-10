<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title></title>
</head>
<body>
	<form action="LoginServlet" method="POST">
			<p>usuario:</p> <input type="text" name="username"/><br/>
			<p>contraseña:</p> <input type="password" name="password"/><br/>
		<input type="submit" value="Iniciar"/>
	</form>
</body>
</html>