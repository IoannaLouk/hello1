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