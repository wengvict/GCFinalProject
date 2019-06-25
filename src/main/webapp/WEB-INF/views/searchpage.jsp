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

<link rel="stylesheet" href="searchstyle.css">

<meta charset="ISO-8859-1">
<title>Advanced Search || Plantopedia</title>
</head>
<body>

	<%@ include file="partials/navbar.jsp"%>

	<div class="container">

		<h1 class="title">Enter a plant name to search:</h1>
		<hr class="my-4">
	</div>

	<div class="col-sm-6 offset-sm-3 text-center">
		<form action="findplants">
			<div class="form-group">
				<input class="form-control form-control-lg" type="text"
					placeholder="Try 'aloe vera'" name="plantname" id="inputLarge">
			</div>

			<div class="form-inline" align="center">
				<div class="btn-group btn-group-toggle" data-toggle="buttons"
					bis_skin_checked="1">
					<label class="btn btn-success"><input type="radio"
						name="nametype" value="scientific"> Scientific Name</label> <label
						class="btn btn-success active" checked> <input
						type="radio" name="nametype" value="common" checked>
						Common Name
					</label>
				</div>


				<div class="form-inline" align="center">
					<div class="btn-group btn-group-toggle" data-toggle="buttons"
						bis_skin_checked="1">
						<label class="btn btn-info"> <input type="checkbox"
							name=""> Low Sunlight
						</label> <label class="btn btn-info"> <input type="checkbox"
							name=""> Med Sunlight
						</label> <label class="btn btn-info"> <input type="checkbox"
							name=""> High Sunlight
						</label>
					</div>
				</div>
			</div>
			<br>
				<input class="btn btn-warning btn-lg" type="submit"
					value="Find My Plant">
			

		</form>
	</div>

	<br>


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