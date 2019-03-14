<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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
			<h1>Γεια σου, <%= request.getParameter("onoma")%> <%= request.getParameter("onoma2")%></h1>
		</div>
	</div>
</body>
</html>