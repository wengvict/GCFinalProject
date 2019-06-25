<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<link rel="stylesheet" href="navbarstyle.css">
<header>

	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="/">Plantopedia</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarColor03" aria-controls="navbarColor03"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarColor03"
			bis_skin_checked="1">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="/">Home </a></li>
				<li class="nav-item"><a class="nav-link" href="/toxicitypage">List of Toxic Plants</a></li>
				<li class="nav-item"><a class="nav-link" href="/inventorylogin">Garden
						Inventory</a></li>
				<li class="nav-item"><a class="nav-link" href="/search">Advanced
						Search</a></li>
				<li class="nav-item"><a class="nav-link" href="/about">About</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/inventorylogin">Login</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/logout">Logout</a>
				</li>
			</ul>
			<form class="form-inline my-2 my-lg-0" action="findplants">
				<input class="form-control mr-sm-2" type="text" name="plantname"
					placeholder="Try 'aloe vera'"> <br>

				<div class="btn-group btn-group-toggle" data-toggle="buttons"
					bis_skin_checked="1">
					<label class="btn btn-success"> <input type="radio"
						name="nametype" value="scientific">Scientific
					</label> <label class="btn btn-success active" checked> <input type="radio"
						name="nametype" value="common" checked>Common
					</label>
				</div>

				<button class="btn btn-warning my-2 my-sm-0" type="submit">Find
					My Plant</button>
			</form>

		</div>
	</nav>
		
</header>

