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
<title>Last Water Date</title>
</head>
<body>
	<%@ include file="partials/navbar.jsp"%>

<div class="jumbotron">
<h1>What was the last date you watered this plant?</h1>
<hr class="my-4">
<form action="adddate">
<div class="form-group" align="center">
  <label class="col-form-label col-form-label-lg" for="waterdate">${ plant.plantname }</label>
  <br>
<input type="hidden" name="id" value="${ plant.id }" id="waterdate">
 <input class="form-control form-control-lg" type="date" placeholder=".form-control-lg" id="inputLarge" name="waterdate">
<br>
<input type="submit" value="Add Date" class="btn btn-info">
</div>
</form>
</div>

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