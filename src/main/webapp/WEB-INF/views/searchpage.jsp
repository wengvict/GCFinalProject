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
		<input type="submit" value="Find my plant!">
	</form>
	
	<br>
	Scientific name: ${plantresult.scientificName }
	<br>
	Common name: ${plantresult.commonName }
	<br>
	Duration: ${plantresult.duration }
	<br>
	Common family: ${plantresult.familyCommonName }
</body>
</html>