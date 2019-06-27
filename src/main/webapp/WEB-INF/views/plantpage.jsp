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

<link rel="stylesheet" href="plantpagestyle.css">

<meta charset="ISO-8859-1">
<title>${plantfacts.common_name } || Plantopedia</title>
</head>
<body>

	<%@ include file="partials/navbar.jsp"%>

	<br>
	<div class="container">

		<div class="jumbotron" bis_skin_checked="1">

			<h4 class="title">Scientific Name: ${plantfacts.scientific_name }
				|| Common Name: ${plantfacts.common_name }</h4>
			<br>
			<div class="plantdetails">
				<h4 class="warning">Please note that data for some species may
					be incomplete.</h4>
				<br>
				<h5 class="subheader">General Plant Facts</h5>
				Phyla name: ${plantfacts.division.name } <br> Order name:
				${plantfacts.order.name } <br> Family scientific name:
				${plantfacts.family.name } <br> Family common name:
				${plantfacts.family_common_name } <br> Genus name:
				${plantfacts.genus.name } <br> Duration: ${plantfacts.duration }
				<br> <br>

				<h5 class="subheader">Extended General Plant Facts</h5>
				Growth form: ${plantfacts.main_species.specifications.growth_form }
				<br> Growth habit:
				${plantfacts.main_species.specifications.growth_habit } <br>
				Growth period:
				${plantfacts.main_species.specifications.growth_period } <br>
				Growth rate: ${plantfacts.main_species.specifications.growth_rate }
				<br> Lifespan:
				${plantfacts.main_species.specifications.lifespan } <br> Does
				this plant retain its leaves?
				${plantfacts.main_species.specifications.leaf_retention } <br>
				Mature height:
				${plantfacts.main_species.specifications.mature_height.ft } feet or
				${plantfacts.main_species.specifications.mature_height.cm }
				centimeters <br> Shape and orientation:
				${plantfacts.main_species.specifications.shape_and_orientation } <br>
				Toxicity: ${plantfacts.main_species.specifications.toxicity } <br>
				Edible by humans? ${plantfacts.main_species.products.palatable_human }
				<br> <br>

				<h5 class="subheader">Foliage Facts</h5>
				Foliage color: ${plantfacts.main_species.foliage.color } <br>
				Foliage texture: ${plantfacts.main_species.foliage.texture } <br>
				<br>

				<h5 class="subheader">Flower Facts</h5>
				Flower color: ${plantfacts.main_species.flower.color } <br> Is
				the flower conspicuous? ${plantfacts.main_species.flower.conspicuous }
				<br> Flower bloom period:
				${plantfacts.main_species.seed.bloom_period } <br> <br>

				<h5 class="subheader">Fruit and Seed Facts</h5>
				Seed color: ${plantfacts.main_species.fruit_or_seed.color } <br>
				Seed period begins in:
				${plantfacts.main_species.fruit_or_seed.seed_period_begin } <br>
				Seed period ends in:
				${plantfacts.main_species.fruit_or_seed.seed_period_end } <br>
				<br>

				<h5 class="subheader">Parts That Can be Propagated</h5>
				Bare root: ${plantfacts.main_species.propagation.bare_root } <br>
				Bulbs: ${plantfacts.main_species.propagation.bulbs } <br>
				Container: ${plantfacts.main_species.propagation.container } <br>
				Corms: ${plantfacts.main_species.propagation.corms } <br>
				Cuttings: ${plantfacts.main_species.propagation.cuttings } <br>
				Seed: ${plantfacts.main_species.propagation.seed } <br> Sod:
				${plantfacts.main_species.propagation.sod } <br> Sprigs:
				${plantfacts.main_species.propagation.sprigs } <br>
				Tubers:${plantfacts.main_species.propagation.tubers } <br> <br>

				<h5 class="subheader">Horticultural Requirements</h5>
				Anaerobic Tolerance:
				${plantfacts.main_species.growth.anaerobic_tolerance } <br>
				Drought tolerance:
				${plantfacts.main_species.growth.drought_tolerance } <br>
				Fertility requirements:
				${plantfacts.main_species.growth.fertility_requirement } <br>
				Fire tolerance: ${plantfacts.main_species.growth.fire_tolerance } <br>
				Minimum frost-free days:
				${plantfacts.main_species.growth.frost_free_days_minimum } <br>
				Hedge tolerance: ${plantfacts.main_species.growth.hedge_tolerance }
				<br> Minimum soil pH:
				${plantfacts.main_species.growth.ph_minimum } <br> Maximum soil
				pH: ${plantfacts.main_species.growth.ph_maximum } <br> Soil
				salinity tolerance:
				${plantfacts.main_species.growth.salinity_tolerance } <br>
				Shade tolerance: ${plantfacts.main_species.growth.shade_tolerance }
				<br> Root depth minimum:
				${plantfacts.main_species.growth.root_depth_minimum.inches } inches,
				or ${plantfacts.main_species.growth.root_depth_minimum.cm }
				centimeters <br> Temperature minimum:
				${plantfacts.main_species.growth.temperature_minimum.deg_f }
				Fahrenheit, or
				${plantfacts.main_species.growth.temperature_minimum.deg_c } Celsius
				<br> <br>

				<h5 class="subheader">Soil Type Tolerance</h5>
				Fine soil: ${plantfacts.main_species.soils_adaptation.fine } <br>
				Medium soil: ${plantfacts.main_species.soils_adaptation.medium } <br>
				Coarse soil: ${plantfacts.main_species.soils_adaptation.coarse } <br>
				<br>

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