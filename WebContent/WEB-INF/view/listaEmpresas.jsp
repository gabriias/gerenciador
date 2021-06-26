<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>   

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Lista de Empresas</title>
	</head>
	<body>

		<h3>Lista de Empresas Cadastradas</h3>
		Usuario Logado - ${usuarioLogado.login}
		<c:import url="logoutParcial.jsp"></c:import>
		
		<c:if test="${not empty empresa}">
			A empresa ${empresa} foi cadastrada com sucesso!
		</c:if>

		<ul>
			<c:forEach items="${empresas}" var="empresa">
				<li> 
					${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" /> 
					<a href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.id}">editar</a>
					<a href="/gerenciador/entrada?acao=RemoveEmpresa&id=${empresa.id}">excluir</a>
				</li>
			</c:forEach>		
		</ul>

	</body>
</html>