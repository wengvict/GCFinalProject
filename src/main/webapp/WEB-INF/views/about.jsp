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

<link rel="stylesheet" href="aboutstyle.css">

<meta charset="ISO-8859-1">
<title>About || Plantopedia</title>
</head>
<body>

	<%@ include file="partials/navbar.jsp"%>

	<div class="content">

		<div class="title">
			<h1>Who We Are</h1>
		</div>

		<div class="container">
			<p>
				Plantopedia is a collection of data from a handful of APIs that
				provide animal-loving agriculture enthusiasts with gardening advice.
				We cover about 8,000 species of plants and each species' preference
				for water, soil pH, light, root depth, etc. If thorough data is not
				a concern, we have information on over 92,000 species. We also cover
				450 species of common plants that are unsafe for pet consumption and
				cause behind it. Additionally, we encourage our users to aid in
				making our planet a greener place as well as helping our urban
				neighbors in need of leafy greens. For more information, see the
				cards below on
				<bold>We Love the Earth</bold>
				and
				<bold>The Michigan Urban Farming Initiative</bold>
				. Let's shed light on plant, pet, and human lives together. <br>
				<br>
			<div class="separate">🌱 🌱 🌱</div>
			<br>


			<div class="title">
				<h3>
					Our Sources 
				</h3>
			</div>
			<br>
			<h3>
				<center>
					<a href="https://trefle.io/" class="linkylink">Trefle</a>, <a
						href="https://plantsdb.xyz/heartbeat" class="linkylink">PlantsDB</a>,
					<a href="https://plants.sc.egov.usda.gov/java/" class="linkylink">USDA
						National Resources Conservation Service</a>, <a
						href="https://www.aspca.org/">ASPCA</a>
				</center>
			</h3>
			<br>
			<div class="separate">🌱 🌱 🌱</div>
			<br>
			<div class="title">
				<h3>Giving Back</h3>
			</div>
		</div>


		<div class="d-flex justify-content-center">

			<div class="card bg-light mb-3" style="max-width: 20rem;"
				bis_skin_checked="1">
				<div class="card-header" bis_skin_checked="1">
					<img
						src="https://s.yimg.com/cv/apiv2/welovetheearth/images/optimized/icons/favicon-16x16.png"
						style="width: 16px; height: 16px;"> We Love the Earth
				</div>
				<div class="card-body" bis_skin_checked="1">
					<h4 class="card-title">
						<a href="https://welovetheearth.org/"> WeLoveTheEarth.org</a>
					</h4>
					<p class="card-text">The Earth needs our help. If we don’t make
						massive changes to our behavior over the next twelve years, the
						damage we’ve done to this...</p>
				</div>
			</div>

			<div class="card bg-light mb-3" style="max-width: 28rem;"
				bis_skin_checked="1">
				<div class="card-header" bis_skin_checked="1">
					<img src="https://www.aspca.org/sites/default/files/favicon.ico"
						style="width: 16px; height: 16px;"> American Society for the
					Prevention of Cruelty to Animals
				</div>
				<div class="card-body" bis_skin_checked="1">
					<h4 class="card-title">
						<a href="https://www.aspca.org/">Aspca.org</a>
					</h4>
					<p class="card-text">The American Society for the Prevention of
						Cruelty to Animals® (ASPCA®) was the first humane society to be
						established in North America and is, today, one of the largest in
						the world...</p>
				</div>
			</div>

			<div class="card bg-light mb-3" style="max-width: 20rem;"
				bis_skin_checked="1">
				<div class="card-header" bis_skin_checked="1">
					<img
						src="https://static.wixstatic.com/ficons/bd3e63_010d6dfef09042a399e8b37ffb735a76_fi.ico"
						style="width: 16px; height: 16px;"> The Michigan Urban
					Farming Initiative
				</div>
				<div class="card-body" bis_skin_checked="1">
					<h4 class="card-title">
						<a href="https://www.miufi.org/">Miufi.org</a>
					</h4>
					<p class="card-text">The Michigan Urban Farming Initiative is a
						501(c)(3) nonprofit organization that seeks to engage members of
						the Michigan community...</p>
				</div>
			</div>

		</div>

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