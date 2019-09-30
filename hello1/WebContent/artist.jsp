<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet" href="css/bootstrap.css">

<title>Add Artist</title>
</head>

<body>

<div class="container "> 	
<br>
<h3>Add/Edit an Artist:</h3>

		<form action="ArtistServlet" method="POST">

			<div class="form-group">
				<label>Artist Id: </label> <input type="number"
					class="form-control" name="artist_id" value="<c:out value="${artist.artist_id}" />" placeholder="Δώσε Κωδικό " />
			</div>
			<div class="form-group">
				<label>First Name: </label> <input type="text" class="form-control"
					name="firstname" value="<c:out value="${artist.firstname}" />" placeholder="Δώσε Όνομα" />
			</div>
			<div class="form-group">
				<label>Last Name: </label> <input type="text"
					class="form-control" name="lastname" value="<c:out value="${artist.lastname}" />" placeholder="Δώσε Επώνυμο" />
			</div>
			<div class="form-group">
				<label>Genre Id: </label> <input type="number"
					class="form-control" name="genre_id" value="<c:out value="${artist.genre_id}" />" placeholder="Δώσε Κωδικό Είδους" />
			</div>
			<div class="form-group">
				<label>Date of Birth: </label> <input type="date"
					class="form-control" name="date_of_birth" value="<c:out value="${artist.date_of_birth}" />" placeholder="Δώσε Ημερομηνία Γέννησης" />
			</div>
			<div class="form-group">
				<label>Date of Death: </label> <input type="date"
					class="form-control" name="date_of_death" value="<c:out value="${artist.date_of_death}" />" placeholder="Δώσε Ημερομηνία Θανάτου" />
			</div>
			
			<div style="text-align: left">
				<input type="submit" class="btn btn-info" value="Save">
			</div>
		</form>
	</div>

</body>
</html>