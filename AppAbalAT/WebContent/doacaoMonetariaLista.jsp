<%@page import="auxiliar.Constante"%>
<%@page import="negocio.DoacaoMonetaria"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doacao Monetaria</title>

<link rel="stylesheet" type="text/css" href="css/estilo.css">

</head>
<body>
	<%
	List<DoacaoMonetaria> doacao = (List<DoacaoMonetaria>)request.getAttribute("lista");
	%>
			<h4>Doacao Monetaria</h4>	
			
	<%if(doacao != null) {%>
		<table border="1" id="customers">
			<tr>
				<th width="75">Nome Atividade </th>      
				<th width="75">Data Atividade</th>       
<!-- 				<th width="75">Hora</th>         -->
				<th width="75">Categoria</th> 
				<th width="75">Descri��o</th>           
				<th width="75">Valor Doacao</th>    
				<th width="75">Meta Arrecada��o</th>     
				<th width="75">Valor Arrecadado</th> 
				<th width="75">Opera��es</th>        
								
			</tr>
	<%for(DoacaoMonetaria d : doacao) {
	%>		
			<tr>
				<td align="center"><%=d.getNomeAtividade()%></td>
				<td align="center"><%=Constante.obterDataFormatada(d.getDataAtividade().getTime())%></td>

				<td align="center"><%=d.getCategoria()%></td>
				<td align="center"><%=d.getDescricao()%></td>
				<td align="center"><%=d.getValorDoacao()%></td>
				<td align="center"><%=d.getMetaArrecadacao()%></td>
				<td align="center"><%=d.getValorArrecadado()%></td>
				<td align= "center">
					<form action="DoacaoMonetariaController" method="get">
						<input type= "hidden" name ="id" value="<%=d.getId() %>">
					
						<input type="submit" name= "operacao" value="Excluir">
					</form>
					<form action="DoacaoMonetariaController" method="get">
						<input type= "hidden" name ="id" value="<%=d.getId() %>">
						
						<input type="submit" name= "operacao"value="Alterar">
					</form>
										
					</td>
			</tr>
		<%}%>
		</table>
		<%} %>
		<hr>
			<form action="DoacaoMonetariaController" method="get">
	
		<input type="submit" name= "operacao" value="Incluir">
	</form>
	<form action="DoacaoMonetariaController" method="get">
		<input type="submit" name= "operacao" value="Voltar">
	</form>
	

<hr>
</body>
</html>