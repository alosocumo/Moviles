<%--
  Created by IntelliJ IDEA.
  User: Alondra
  Date: 27/02/2017
  Time: 07:50 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
    <meta name="layout" content="main">
</head>

<body>
    <table>
        <thead>
        <tr>
            <th>Nombre</th>
            <th>Que</th>
            <th>Donde</th>
            <th>URL</th>
            <th>Opciones</th>
        </tr>
        </thead>
        <tbody>
        <g:each in="${alimentos}" var="alimento">
            <tr>
                <td>${alimento.nombre}</td>
                <td>${alimento.que}</td>
                <td>${alimento.donde}</td>
                <td>${alimento.url}</td>
                <td><a href="show?id=${alimento.id}">Ver</a></td>
            </tr>
        </g:each>
        </tbody>

    </table>
</body>
</html>