<%--
  Created by IntelliJ IDEA.
  User: mahdi
  Date: 3/10/2021
  Time: 12:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert etudiant</title>
</head>
<body>
<form action="insertEtudiant" method="post">
    <label for="Cin">cin</label>
    <input id="Cin" type="text" name="cin">
    <br>
    <label for="Name">Nom</label>
    <input id="Name" type="text" name="name">
    <br>
    <label for="LastName">Prenom</label>
    <input id="LastName" type="text" name="lastName">
    <br>
    <button type="submit">ajouter etudiant</button>
</form>
</body>
</html>
