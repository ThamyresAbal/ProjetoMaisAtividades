<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>

<link rel="stylesheet" type="text/css" href="css/estilo.css">

</head>
<body>
	<form action="AppController" method="get">
		
		<input type="hidden" name="tela" value="arrecadacaoLista.jsp">
	
		<input type="submit" value="Arrecada��o">
	</form>

	<form action="AppController" method="get">
		
		<input type="hidden" name="tela" value="contatoLista.jsp">
	
		<input type="submit" value="Contato">
	</form>
	
	<form action="AppController" method="get">
		
		<input type="hidden" name="tela" value="doacaoMonetariaLista.jsp">
	
		<input type="submit" value="Doa��o">
	</form>
	
	<form action="AppController" method="get">
		
		<input type="hidden" name="tela" value="endrecoLista.jsp">
	
		<input type="submit" value="Endere�o">
	</form>
	
	<form action="AppController" method="get">
		
		<input type="hidden" name="tela" value="oficinaLista.jsp">
	
		<input type="submit" value="Oficina">
	</form>
	
	<form action="AppController" method="get">
		
		<input type="hidden" name="tela" value="pessoaFisicaLista.jsp">
	
		<input type="submit" value="Pessoa F�sica">
	</form>
	
	<form action="AppController" method="get">
		
		<input type="hidden" name="tela" value="pessoaJuridicaLista.jsp">
	
		<input type="submit" value="Pessoa Jur�dica">
	</form>

</body>
</html>