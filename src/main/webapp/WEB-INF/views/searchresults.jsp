<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>
		<thead>
			<tr>
				<td>Scientific Name</td>
				<td>Common Name</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${plantresult }" var="p">
				<tr>
					<td>${p.scientific_name }</td>
					<td>${p.common_name }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>