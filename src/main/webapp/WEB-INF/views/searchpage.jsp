<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Enter a plant name to search:</h1>
	<form action="findplants">
		Plant: <input type="text" name="plantname" placeholder="Try 'aloe vera'">
		<input type="radio" name="nametype" value="scientific"> Scientific
		<input type="radio" name="nametype" value="common" checked> Common
		<input type="submit" value="Find my plant!">
	</form>
	
	<br>

</body>
</html>