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

<title>Artists List</title>
</head>

<body>
 <table>
 <thead>
 <tr>
 <th>Artist Id</th>
 <th>First Name</th>
 <th>Last Name</th>
 <th>Genre Id</th>
 <th>Date of birth</th>
 <th>Date of death</th>
 <th colspan="7">action</th>
			</tr>
		</thead>
 <tbody>
 <c:forEach items="${artists}" var="artist">
 <tr>
 <td><c:out value="${artist.artist_id}" /></td>
 <td><c:out value="${artist.firstname}" /></td>
 <td><c:out value="${artist.lastname}" /></td>
 <td><c:out value="${artist.genre_id}" /></td>
 <td><fmt:formatDate pattern="dd-mm-yyyy" value="${artist.date_of_birth}" /></td>
 <td><fmt:formatDate pattern="dd-mm-yyyy" value="${artist.date_of_death}" /></td>
 <td><a href="ArtistServlet?action=edit&artist_id=<c:out value="${artist.artist_id}"/>">Update</a></td>
 <td><a href="ArtistServlet?action=delete&artist_id=<c:out value="${artist.artist_id}"/>">Delete</a></td>
 
 </tr>
 </c:forEach>
 </tbody>
 </table>
 <p><a href="ArtistServlet?action=insert">Add Artist</a></p>
 
</body>
</html>





















