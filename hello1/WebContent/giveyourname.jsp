<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet" href="css/bootstrap.css">

<title>Γεια σου!</title>

</head>

<body>

<div class="container">
	<br>
	<nav class="navbar navbar-expand-sm bg-light">
		<ul class="navbar-nav">
			<li class="nav-item"><a class="navbar-brand"> Username: ${uname}</a></li>
			<li class="nav-item">
				<form action="LogoutCheck" method="POST">

					<button class="btn btn-outline-success " type="submit">Log out</button>
				</form>
			</li>

		</ul>
	</nav>
	<br>
	<br>
	
	<h2>Πληκτρολόγησε το ονομα σου:</h2>
	
	<form action="NameCheck" method="POST">
		<div class="form-group">
		<label>Όνομα:</label>
		<input type="text" class="form-control" name="onoma" placeholder="Δώσε Όνομα"/>
		</div>
		
		<div class="form-group">
		<label>Επώνυμο:</label>
		<input type="text" class="form-control" name="onoma2" placeholder="Δώσε Επώνυμο"/>
		</div>
		<div style="text-align:center"> 
		<input type="submit" class="btn btn-info" value="Submit">
		</div>
	</form>
</div>

</body>
</html>