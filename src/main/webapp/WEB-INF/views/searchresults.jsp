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
${addconfirm }
	<table>
		<thead>
			<tr>
				<td>Scientific Name</td>
				<td>Common Name</td>
				<td> </td>

			</tr>
		</thead>
		<tbody>
			<c:forEach items="${plantresult }" var="p">
				<tr>
					<td><a href="/plantpage?plantid=${p.id }">${p.scientific_name }</a></td>
					<td>${p.common_name }</td>
					<td><a href="/addplant?scientificname=${p.scientific_name }">Add to Garden</a></td>				
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>