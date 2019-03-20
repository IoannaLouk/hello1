<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=yes">

<link rel="stylesheet" href="css/bootstrap.css">
<title>Γεια σου!</title>

</head>
<body>

<div class="text-center">
		<div class="jumbotron">
			<h1>Γεια σου, ${uname} ${uname2}</h1>
		</div>
		
		<form action="LogoutCheck" method="POST">

					<button class="btn btn-outline-success " type="submit">Log out</button>
				</form>	
	</div>
</body>
</html>