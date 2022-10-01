<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<!doctype html>
<html lang="pt-br">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Eventos</title>

<!-- Bootstrap -->
<link href="/CSS/style.css" rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">

<!-- Google Fonts  -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;500&display=swap"
	rel="stylesheet">

<!-- icon -->
<link rel="stylesheet"
	href="https://cdn.es.gov.br/fonts/font-awesome/css/font-awesome.min.css">

<!-- CSS -->
<link rel="stylesheet" type="text/css" media="screen" href="style.css">

</head>

<body>

	<!-- Navbar -->
	<header>
		<nav class="navbar navbar-expand-lg navbar-dark bg-primary m-0"
			id="navbar">
			<div class="container-fluid">
				<img class="img-fluid" src="Images/Logo.png" alt="Logo">
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse justify-content-end me-3"
					id="navbarSupportedContent">
					<ul class="navbar-nav">
						<li class="nav-item px-1"><a class="nav-link px-1"
							aria-current="page" href="index.html"><i
								class="icon fa fa-home mx-1" aria-hidden="true"
								style="font-size: 1.3rem;"></i>Home<a></li>
						<li class="nav-item px-1"><a class="nav-link px-1"
							href="login.html"><i class="fa fa-user-circle-o mx-1"
								aria-hidden="true" style="font-size: 1.1rem;"></i>Login<a></li>
						<li class="nav-item px-1"><a class="nav-link"
							href="formularios.html"><i class="fa fa-user-plus mx-1"
								aria-hidden="true" style="font-size: 1.1rem;"></i>Cadastro</a></li>
						<li class="nav-item px-1"><a id="active"
							class="nav-link active" aria-current="page" href="#"><i
								class="icon fa fa-calendar-check-o mx-1" aria-hidden="true"
								style="font-size: 1.1rem;"></i><strong> Eventos</a></strong></li>

						<li class="nav-item px-1"><a class="nav-link"
							href="contato.html"><i class="fa fa-phone-square mx-1"
								aria-hidden="true" style="font-size: 1.1rem;"></i>Contato</a></li>
						<li class="nav-item px-1"><a class="nav-link"
							href="sobre.html"><i class="fa fa-book mx-1"
								aria-hidden="true"></i>Sobre</a></li>
					</ul>
				</div>
			</div>
		</nav>
		<!-- Navbar Fim -->
	</header>

	<!-- Main -->
	<!-- Eventos -->
	<main>
		<div class="row p-0 m-0">
			<div class="col text-center justify-content-center"
				style="margin-left: 18%;">
				<jstl:forEach items="${listaEventos}" var="evento">
					<div class="card my-5 w-75">
						<div class="card-header text-light bg-primary">${evento.dataEvento}</div>
						<div class="card-body">
							<h5 class="card-title">Titulo do evento</h5>
							<p class="card-text">Descrição do evento</p>
							<div class="card-footer">${evento.local}</div>
							<a href="#" class="btn btn-secondary mt-3"
								style="background-color: #ff9b19;">Saiba mais</a>
						</div>
					</div>
				</jstl:forEach>
	</main>
	<!-- Eventos Fim -->
	<!-- Main Fim -->

	<!-- Rodapé -->
	<footer>
		<div
			class="navbar bg-primary container-fluid justify-content-center align-content-center fixed-bottom">
			<a class="nav-item" href="#" style="height: 30px;">
				<p class="text-white fs-6">
					<small>&copy; 2022 SQUAD 33</small>
				</p>
			</a>
		</div>
	</footer>
	<!-- Rodapé Fim -->

	<!-- JavaScript -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
		crossorigin="anonymous"></script>
</body>

</html>