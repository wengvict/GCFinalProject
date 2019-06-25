<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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