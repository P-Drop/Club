<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>El Club</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
<div class="card">
  <div class="card-header">
    <h2>Nuevo Socio</h2>
  </div>
  <div class="card-body">
    <form action="ControllerWeb" method="get" enctype="multipart/form-data" class="row g-3 needs-validation" novalidate>
    <div class="col-md-4">
    <label for="nombre" class="form-label">Nombre del Socio: </label>
    <input type="text" class="form-control" id="nombre" required name="nombreSocio">
    <div class="invalid-feedback">
    El nombre es requerido
    </div>
    </div>
    <div class="col-md-4">
    <label for="direccion" class="form-label">Direccion: </label>
    <input type="text" class="form-control" id="direccion" required name="direccionSocio">
    <div class="invalid-feedback">
    La direccion es requerida
    </div>
    </div>
    <div class="col-md-4">
    <label for="fecha" class="form-label">Fecha de Alta: </label>
    <input type="date" class="form-control" id="fecha" required name="fechaAlta">
    <div class="invalid-feedback">
    Indique la fecha de alta
    </div>
    </div>
    <div class="col-md-4">
    <label for="archivo" class="form-label">¿Tiene un fichero XML? </label>
    <input type="file" accept=".xml" class="form-control" id="archivo" name="archivo" pattern="^[a-zA-Z0-9]+\.[xX][mM][lL]$">
    <div class="invalid-feedback">
    Archivo no valido
    </div>  
    </div>
    <div class="col-12">
    <input type="submit" class="btn btn-dark" value="Enviar">
    </div>
    </form>
</div>
</div>
</div>
<div class="container">
<c:out value="${msg}"></c:out>
</div>
<div class="container">
		<c:if test="${not empty misSocios}">
			<table class="table table-dark table-striped table-borderless">
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Nombre</th>
						<th scope="col">Direccion</th>
						<th scope="col">Fecha de Alta</th>
						<th scope="col" class="bg-light"></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${misSocios}" var="s">
						<tr class="align-middle">
							<th scope="row"><c:out value="${s.idSocio}" /></th>
							<td><c:out value="${s.nombreSocio}" /></td>
							<td><c:out value="${s.direccion}" /></td>
							<td><c:out value="${s.fechaAlta}" /></td>
							<td class="table-light text-center">
								<div clas="row">
									<div clas="col">
										<a href="#" title="EDITAR">
											<button type="button" class="btn btn-dark"
												data-bs-toggle="modal" data-bs-target="#exampleModal1">
												 <span class="material-symbols-outlined">edit_square</span>
											</button>
										</a>
									</div>
									<div clas="col">
										<a href="#" title="BORRAR"> <span
											class="material-symbols-outlined" data-bs-toggle="modal" data-bs-target="#exampleModal2"> delete </span>
										</a>
									</div>
								</div>
							</td>
						</tr>
					</c:forEach>


				</tbody>
			</table>
		</c:if>
</div>
<script src="js/script.js"></script>
</body>
</html>