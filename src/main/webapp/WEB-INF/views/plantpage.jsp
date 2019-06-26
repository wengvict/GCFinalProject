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

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ include file="partials/navbar.jsp"%>

<h5>General Plant Facts</h5>
Scientific name: ${plantfacts.scientific_name }
<br>

Common name: ${plantfacts.common_name }
<br>
Family common name: ${plantfacts.family_common_name }
<br>
Genus: ${plantfacts.genus.name }
<br>
Duration: ${plantfacts.duration }
<br>
<br>

<h5>Foliage Facts</h5>
Foliage color: ${plantfacts.main_species.foliage.color }
<br>
Foliage texture: ${plantfacts.main_species.foliage.texture }
<br>
<br>

<h5>Flower Facts</h5>
Flower color: ${plantfacts.main_species.flower.color }
<br>
Is the flower conspicuous? ${plantfacts.main_species.flower.conspicuous }
<br>
<br>

<h5>Fruit and Seed Facts</h5>
Seed color: ${plantfacts.main_species.fruit_or_seed.color }
<br>
Seed period begins in: ${plantfacts.main_species.fruit_or_seed.seed_period_begin }
<br>
Seed period begins in: ${plantfacts.main_species.fruit_or_seed.seed_period_end }
<br>
<br>


<h5>Soil Types ${plantfacts.scientific_name } Grows In</h5>
Fine soil: ${plantfacts.main_species.soils_adaptation.fine }
<br>
Medium soil: ${plantfacts.main_species.soils_adaptation.medium }
<br> 
Coarse soil: ${plantfacts.main_species.soils_adaptation.coarse }
<br>
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