<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/sandstone/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-G3Fme2BM4boCE9tHx9zHvcxaQoAkksPQa/8oyn1Dzqv7gdcXChereUsXGx6LtbqA"
	crossorigin="anonymous">
<link rel="stylesheet" href="byletter.css">
<meta charset="UTF-8">
<title>Toxic To Animal</title>
</head>
<body>
	


	<table>

		<thead>

			<tr>

				<td>Name</td>

			</tr>

		</thead>

		<tbody>

			<c:forEach items="${ plantlist }" var="p">

				<tr>

					<td><a href="/toxicdetails?id=${p.id }">${p.commonname}</a></td>



				</tr>

			</c:forEach>

		</tbody>

	</table>
	

</body>
</html>