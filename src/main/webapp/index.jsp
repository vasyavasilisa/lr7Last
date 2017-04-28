<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Поиск</title>
    <style>
        div { margin-bottom: 10px; }
    </style>
</head>
<body>
<div align="center">
        <h1>Поиск сотрудников</h1>
        <hr/>
        <br>
        <br>
        <br>
    <form action="./Search" method="get">
        <div>
            <label for="id">Идентификационный номер (id) сотрудника</label><br/>
            <br>
            <input type="text" name="id" placeholder="id" id="id"/>
        </div>
        <div>
            <input type="submit" value="Найти"/>
            <input type="reset" value="Очистить"/>
        </div>
    </form>
    <c:choose>
        <c:when test="${not empty error}">
            <p>${error}</p>
        </c:when>
        <c:when test="${not empty customer}">
            <p>Фамилия - ${customer.surname}</p>
            <p>Zip-код - ${customer.zip}</p>
            <p>Город - ${customer.city}</p>
        </c:when>
    </c:choose>
</div>
</body>
</html>