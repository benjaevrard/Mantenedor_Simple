<%-- 
    Document   : index
    Created on : 17-01-2024, 23:11:08
    Author     : Benjamin Evrard
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/styles.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css">
    <title>Formulario Centrado</title>
</head>
<body class="body-mantenedor"style="background-color: #88CED8">

    <form class="form-mantenedor">
        <h1 style="margin-top: 0px; text-align: center">Mantenedor</h1>
        <div class="mb-3">
            <label class="form-label" for="exampleFormControlInput1">Nombre</label>
            <input type="text" id="exampleFormControlInput1" class="form-control" placeholder="John Doe">
        </div>
        <div class="mb-3">
            <label class="form-label" for="exampleFormControlInput3">Email</label>
            <input type="email" id="exampleFormControlInput3" class="form-control" placeholder="name@example.com">
        </div>
    </form>

</body>
</html>
