<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"  "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Gestion des Etudiants</title>
<style>
body {
  background-image: url('file:///C:/Users/user/Desktop/eclipse2/Gestion/images/1000_F_294375555_tpcdo43DC1XFr6kpSv4v4bEsmcY1GgWz.jpg');
</style>
</head>
<body>
     
       
          
       
    <div align="center" id="bloc1">
  
    <h1> Gestion des etudiants</h1>
	<f:form action="saveEtudiant" modelAttribute="etudiant">

		<table  border="0px solid black collapse">
			<tr>
			<td>ID Etudiant:<f:hidden path="idEtudiant"/></td>
			<td>${etudiant.idEtudiant}</td>
			</tr>
			<tr>
			<td>Nom Etudiant:</td>
			<td><f:input path="nomEtudiant"/></td>
			<td><f:errors path="nomEtudiant" cssClass="error"/></td>
			</tr>
			<tr>
			<td>Prenom Etudiant:</td>
			<td><f:input path="prenomEtudiant"/></td>
			<td><f:errors path="prenomEtudiant" cssClass="error"/></td>
			</tr>
			<tr>
			<td>CIN Etudiant:</td>
			<td><f:input path="cinEtudiant"/></td>
			<td><f:errors path="cinEtudiant" cssClass="error"/></td>
			</tr>
			<tr>
			<td>Niveau d'etude Etudiant:</td>
			<td><f:input path="niveauEtudiant"/></td>
			<td><f:errors path="niveauEtudiant" cssClass="error"/></td>
			</tr>
			<tr>
			<td>Specialité Etudiant:</td>
			<td><f:input path="specialiteEtudiant"/></td>
			<td><f:errors path="specialiteEtudiant" cssClass="error"/></td>
			</tr>
			<tr>
			<td><input type="submit" value="Save"></td>
			</tr>
		</table>
	</f:form>
	<br>
	<br>
	<br>
	
	
	<table border="1" width="80%">
		<tr>
		<th>ID</th><th>Nom</th><th>Prenom</th>	<th>CIN</th><th>Niveau d'etude</th>	<th>Specialite</th>
		</tr>
	<c:forEach items="${etudiants}" var="e">
		<tr>
		<td>${e.idEtudiant }</td>
		<td>${e.nomEtudiant }</td>
		<td>${e.prenomEtudiant }</td>
		<td>${e.cinEtudiant }</td>
		<td>${e.niveauEtudiant }</td>
		<td>${e.specialiteEtudiant }</td>
		<td><a href="deleteEtudiant?id=${e.idEtudiant }">Supprimer</a></td>
		<td><a href="editEtudiant/${e.idEtudiant }">Edit</a></td>
		</tr>
	</c:forEach>
	</table>
	</div>
</body>
</html>
