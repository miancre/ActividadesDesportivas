<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agregar Deportista</title>

</head>
<div class="content">
<body>
<h1> Registrar Deportista</h1>
<h2> Hola, por favor ingrese los datos del Deportista </h2>
<form action="Conexion" method="post">
<table cellspacing="3" cellpadding="3" border="1" >
<tr>
<td align="right"> Cedula: </td>
<td><input type="text" name="cedula"></td>
</tr>
<tr>
<td align="right"> Nombre: </td>
<td> <input type="text" name="name"> </td>
</tr>
<tr>
<td align="right"> Apellido: </td>
<td> <input type="text" name="lastname"> </td>
</tr>
<tr>
<td align="right"> Programa Academico: </td>
<td> <input type="text" name="academicprogram"> </td>
</tr>
<tr>
<td align="right"> Altura : </td>
<td> <input type="text" name="height"> </td>
</tr>
<tr>
<td align="right"> Peso : </td>
<td> <input type="text" name="weightr"> </td>
</tr>
<tr>
<td align="right"> Telefono : </td>
<td> <input type="text" name="phone"> </td>
</tr>
<tr>
<td align="right"> Direccion : </td>
<td> <input type="text" name="address"> </td>
</tr>
</tr>
</table>
<tr>
<tr>
<tr>
<tr>
<input type="submit" value="Enviar">
<input type="reset" value="Nuevo">
<button onclick="window.close();">Cerrar</button> 
</form>
</body>
</div>
</html>