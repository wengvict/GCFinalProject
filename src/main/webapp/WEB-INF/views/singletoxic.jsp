<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/sandstone/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-G3Fme2BM4boCE9tHx9zHvcxaQoAkksPQa/8oyn1Dzqv7gdcXChereUsXGx6LtbqA"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>Toxic Plant</title>
</head>
<body>
<%@ include file="partials/navbar.jsp"%>


Common name: ${donteat.commonname}	<br>
Scientific name: ${donteat.scientificname}<br>
Toxic properties: ${donteat.poisonproperty}<br>
Details: ${donteat.symptoms}<br>
<br>

Toxic to cats: ${donteat.cats}<br>

Toxic to dogs: ${donteat.dogs}<br>
Toxic to horses: ${donteat.horses}<br>



Other names: ${donteat.othernames}

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