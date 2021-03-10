<%--
  Created by IntelliJ IDEA.
  User: mahdi
  Date: 3/10/2021
  Time: 12:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="etudiant.Etudiant" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <tr>
        <th>cin</th>
        <th>prenom<</th>
        <th>nom</th>
    </tr>
    <%
        ArrayList<Etudiant> list = (ArrayList<Etudiant>) request.getAttribute("data");
        for (Etudiant it : list) {%>

    <tr>
        <td><%=it.cin%>
        </td>
        <td><%=it.name%>
        </td>
        <td><%=it.lastName%>
        </td>
    </tr>
    <%}%>
</table>

</body>
</html>
