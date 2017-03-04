<%--
  Created by IntelliJ IDEA.
  User: Alondra
  Date: 26/02/2017
  Time: 09:42 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title> CREAR</title>
</head>
<body>

    <g:form action="crear">
    nombre: <g:fieldValue bean="${alimento}" field="nombre"/><br/>
    que: <g:fieldValue bean="${alimento}" field="que"/><br/>
    donde: <g:fieldValue bean="${alimento}" field="donde"/><br/>
    url: <g:fieldValue bean="${alimento}" field="url"/><br/>

</body>
</html>