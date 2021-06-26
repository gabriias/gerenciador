<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<c:url value="/entrada" var="linkEntradaServlet" />

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Nova Empresa</title>
	</head>
	<body>
		<c:import url="logoutParcial.jsp"></c:import>
		
		<form action="${linkEntradaServlet}" method="post">
			Nome: <input type="text" name="nome" />
			Data da Abertura: <input type="text" name="data" />
			<input type="hidden" name="acao" value="NovaEmpresa" />
			<input type="submit" />
		</form>

	</body>
</html>