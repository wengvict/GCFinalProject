<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Hello Plants</h1>
<table border=3>
<thead>
<tr>
<td>Name</td>

<td>Water</td>
<td>Last Water Date</td>
<td>Next Water Date</td>
<td>Remove Plant</td>
</tr>

</thead>
<tbody>
<c:forEach items="${ p }" var="t">
<tr>
<td>${ t.plantname }</td>

<td><a href="water?id=${ t.id }"> Water</a>
<br>
<a href="manualwater?id=${ t.id }">Add date manually</a>
</td>
<td><span id="fuckjs" class="fuckjs">${ t.formattedDate }</span></td>
<td>${ t.nextDateFormatted }</td>
<td><a href="removeplant?id=${ t.id }">Delete</a></td>
</tr>
</c:forEach>
</tbody>
</table>

<script src="/water.js"></script>

</body>
</html>