<%@page import="auxiliar.Constante"%>
<%@page import="negocio.Oficina"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Oficina</title>

<link rel="stylesheet" type="text/css" href="css/estilo.css">

</head>
<body>
	<%
	List<Oficina> oficina = (List<Oficina>)request.getAttribute("lista");
	%>
	<h4>Oficina</h4>	
			
	<%if(oficina != null) {%>
		<table border="1" id="customers">
			<tr>
				<th width="75">Nome Atividade </th>      
				<th width="75">Data Atividade</th>       
			 	<th width="75">Categoria</th> 
				<th width="75">Descri��o</th>             
				<th width="75">Quantidade de Participantes</th>
				<th width="75">Opera��es</th>    
				
				
			</tr>
	<%for(Oficina o : oficina) {
	%>		
			<tr>
				<td><%=o.getNomeAtividade()%></td>
				<td align="center"><%=Constante.obterDataFormatada(o.getDataAtividade().getTime())%></td>
				<td align="center"><%=o.getCategoria()%></td>
				<td align="center"><%=o.getDescricao()%></td>
				<td align="center"><%=o.getQtdParticipantes()%></td>
				<td align= "center">
					<form action="OficinaController" method="get">
						<input type= "hidden" name ="id" value="<%=o.getId() %>">
					
						<input type="submit" name= "operacao" value="Excluir"/>
					</form>
					<form action="OficinaController" method="get">
						<input type= "hidden" name ="id" value="<%=o.getId() %>">
						
						<input type="submit" name= "operacao" value="Alterar"/>
					</form>
											
					</td>
			</tr>
		<%}%>
		</table>
		<%} %>
		<hr>
	<form action="OficinaController" method="get">
		<input type="submit" name= "operacao" value="Incluir">
	</form>
	<form action="OficinaController" method="get">
		<input type="submit" name= "operacao" value="Voltar">
	</form>
	

<hr>
</body>
</html>