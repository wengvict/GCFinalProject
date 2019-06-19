<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>What was the last date you watered this plant?</h1>
<form action="adddate">
<input type="hidden" name="id" value="${ plant.id }">
${ plant.plantname }<input type="date" name="waterdate">
<input type="submit" value="Add Date">
</form>
</body>
</html>