<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<!doctype html>
<html lang="pt-br">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Conecta +</title>

<!-- Bootstrap -->
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
				<img class="img-fluid" src="Images/Logo.png" alt="Logo"></img>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse justify-content-end me-3"
					id="navbarSupportedContent">
					<ul class="navbar-nav">
						<li class="nav-item px-1"><a id="active"
							class="nav-item" aria-current="page" href="#"><i
								class="icon fa fa-home mx-1" aria-hidden="true"
								style="font-size: 1.3rem;"></i>Home</a></li>
						<li class="nav-item px-1"><a class="nav-link px-1"
							href="login.html"><i class="fa fa-user-circle-o mx-1"
								aria-hidden="true" style="font-size: 1.1rem;"></i>Login</a></li>
						<li class="nav-item px-1"><a class="nav-link"
							href="formularios.html"><i class="fa fa-user-plus mx-1"
								aria-hidden="true" style="font-size: 1.1rem;"></i>Cadastro</a></li>
						<li class="nav-item px-1"><a class="nav-link"
							href="/ConectaMais/listarEventos"><i
								class="fa fa-calendar-check-o mx-1" aria-hidden="true"></i>Eventos</a>
						</li>

						<li class="nav-item px-1"><a class="nav-link" href="vol.html"><i
								class="fa fa-phone-square mx-1" aria-hidden="true"
								style="font-size: 1.1rem;"></i>vol</a></li>
						<li class="nav-item px-1"><a class="nav-link"
							href="sobre.html"><i class="fa fa-book mx-1"
								aria-hidden="true"></i>Sobre</a></li>
					</ul>
				</div>
			</div>
		</nav>
		<!-- Navbar Fim -->
	</header>


	<main class="container">
		<div class="row">
			<div class="col-sm-12 bg-dark bg-opacity-75">
				<h1 class="text-light">
					Perfil de
					<%=request.getParameter("nome_voluntario")%></h1>
			</div>
		</div>

		<div class="row">
			<div class="col-sm-12">
				<table class="table table-primary">
					<thead>
						<tr>

							<th scope="col">Nome</th>
							<th scope="col">Telefone</th>
							<th scope="col">Email</th>
							<th scope="col">Endereço</th>
							<th scope="col">Cidade</th>
							<th scope="col">Estado</th>
							<th scope="col">CEP</th>
							<th scope="col">Formação</th>
							<th scope="col">Sobre</th>
						</tr>
					</thead>
					<tbody>
						<tr class="table-primary">

							<%-- <td><jstl:forEach items="${voluntario}" var="vol"> --%>
							<%-- <tr>
										<td>${vol.nome_voluntario}</td>
										<td>${vol.telefone_voluntario}</td>
										<td>${vol.email_voluntario}</td>
										<td>${vol.logradouro_voluntario}</td>
										<td>${vol.cidade_voluntario}</td>
										<td>${vol.estado_voluntario}</td>
										<td>${vol.cep_voluntario}</td>
										<td>${vol.formacao}</td>
										<td>${vol.sobre_voluntario}</td>
										<td><a href="editar?cpf_voluntario=${vol.cpf_voluntario}"
											class="btn btn-success">Editar</a> <a
											href="excluir?cpf_voluntario=${vol.cpf_voluntario}"
											onclick="return confirm('Deseja Excluir?')"
											class="btn btn-danger">Excluir</a></td>
									</tr> --%>
							<%-- </jstl:forEach> 
								 --%>
							<td><%=request.getParameter("nome_voluntario")%></td>
							<td><%=request.getParameter("telefone_voluntario")%></td>
							<td><%=request.getParameter("email_voluntario")%></td>
							<td><%=request.getParameter("logradouro_voluntario")%></td>
							<td><%=request.getParameter("cidade_voluntario")%></td>
							<td><%=request.getParameter("estado_voluntario")%></td>
							<td><%=request.getParameter("cep_voluntario")%></td>
							<td><%=request.getParameter("formacao")%></td>
							<td><%=request.getParameter("sobre_voluntario")%></td>
						<tr>
					</tbody>
				</table>
			</div>
		</div>

		<div class="row mb-5">
			<div class="col-lg-4 com-sm-12 mb-3 mt-5" style="text-align: center;">
				<a href="eventoForm.html" type="submit" class="btn btn-primary col-6" id="login">Criar um Evento</a>
			</div>
			<div class="col-lg-4 col-sm-12 mb-3 mt-5" style="text-align: center;">
				<a href="index.html"><button type="button" id="senha"
						class="btn btn-info col-6">Editar</button></a>
			</div>
			<div class="col-lg-4 col-sm-12 mb-3 mt-5" style="text-align: center;">
				<a href="index.html"><button type="button" id="senha"
						class="btn btn-danger col-6">Excluir</button></a>
			</div>
		</div>
	</main>

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

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
		crossorigin="anonymous"></script>
</body>

</html>