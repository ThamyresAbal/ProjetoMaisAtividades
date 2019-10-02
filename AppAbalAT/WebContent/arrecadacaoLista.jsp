<%@page import="negocio.Contato"%>
<%@page import="negocio.Usuario"%>
<%@page import="auxiliar.Constante"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="negocio.Arrecadacao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Arrecadacao</title>

<link rel="stylesheet" type="text/css" href="css/estilo.css">

</head>
<body>
<%
	List<Arrecadacao> arrecadacoes= (List<Arrecadacao>)request.getAttribute("lista");

%>
<!-- <form action="ArrecadacaoController" method="get"> -->

<%-- 	<h4>Ol�, <%=user.getUsuario()%>! - (<%=usu.getEmail()%>)</h4> --%>
<!-- </form> -->

	<h4>Arrecadacao</h4>	
		
<%if(arrecadacoes != null) {%>
	<table border="1" id="customers">
		<tr>
			<th width="75">Nome Atividade </th>      
			<th width="75">Data Atividade</th>       
			<th width="75">Categoria</th> 
			<th width="75">Descri��o</th>           
			<th width="75">Quantidade de Participantes</th>    
			<th width="75">Quantidade Alimentos</th>
			<th width="75">Meta Arrecada��o</th>     
			<th width="75">Publico Alvo</th>         
			<th width="75">Quantidade de Brinquedos e Roupas</th>
			<th width="75">Opera��es</th>
			
		</tr>
<%for(Arrecadacao a : arrecadacoes) {
%>		
		<tr>
			<td align="center"><%=a.getNomeAtividade()%></td>
			<td align="center"><%=Constante.obterDataFormatada(a.getDataAtividade().getTime())%></td>
			<td align="center"><%=a.getCategoria()%></td>
			<td align="center"><%=a.getDescricao()%></td>
			<td align="center"><%=a.getQtdParticipantes()%></td>
			<td align="center"><%=a.getQtdAlimentos()%></td>
			<td align="center"><%=a.getMetaArrecadacao()%></td>
			<td align="center"><%=a.getPublicoAlvo()%></td>
			<td align="center"><%=a.getQtdBrinquedosRoupas()%></td>
			<td align= "center">
				<form action="ArrecadacaoController" method="get">
					<input type= "hidden" name ="id" value="<%=a.getId() %>">
				
					<input type="submit" name= "operacao" value="Excluir">
				</form>
				<form action="ArrecadacaoController" method="get">
					<input type= "hidden" name ="id" value="<%=a.getId() %>">
					
					<input type="submit" name= "operacao" value="Alterar">
				</form>
												
			</td>
		
		</tr>
			<%} %>
	</table>
<%}%>

	<form action="ArrecadacaoController" method="get">
		<input type="submit" name= "operacao" value="Incluir">
	</form>
	<form action="ArrecadacaoController" method="get">
		<input type="submit" name= "operacao" value="Voltar">
	</form>

<hr>

	</body>
</html>