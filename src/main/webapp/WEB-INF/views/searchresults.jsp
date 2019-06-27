<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/sandstone/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-G3Fme2BM4boCE9tHx9zHvcxaQoAkksPQa/8oyn1Dzqv7gdcXChereUsXGx6LtbqA"
	crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Search Result || Plantopedia</title>
</head>
<body>

	<%@ include file="partials/navbar.jsp"%>
	
	<br>
	<h5>Results for "${ search }".</h5>
	<h5>Please note that data for some species may be incomplete. </h5>

	${addconfirm }
	<table class="table table-hover">
		<thead>
			<tr class="table-success">
				<td>Scientific Name</td>
				<td>Common Name</td>
				<td></td>
				<td></td>

			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ map }" var="p">
				<tr>
					<td><a href="/plantpage?plantid=${p.key.id }">${p.key.scientific_name }</a></td>
					<td>${p.key.common_name }</td>

					<td><c:choose>
							<c:when test="${not empty p.value.url }">
								<img src="${ p.value.url }" width="200" height="200">
							</c:when>
							<c:otherwise>
								<img
									src="https://media2.giphy.com/media/nNxT5qXR02FOM/giphy.gif">
							</c:otherwise>
						</c:choose></td>

					<!--  <td><img src="${ p.value.url }" width="200" height="200"></td> -->		
					
					<td><a
						href="/addplant?scientificname=${p.key.scientific_name }">Add
							to Garden</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

<!--  
	<a href="allthethings?name=${ search }" class="btn btn-primary btn-lg">I
		don't care about complete data</a>
 -->

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>