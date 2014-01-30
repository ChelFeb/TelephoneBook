<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<script type="text/javascript" src="<c:url value="/resources/js/jquery-2.1.0.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<link rel="stylesheet" media="screen" type="text/css" href="<c:url value="/resources/css/bootstrap.min.css" />"/>
<link rel="stylesheet" media="screen" type="text/css" href="<c:url value="/resources/css/mainPageStyle.css" />"/>
<html>
<head>
    <title>TelephoneBook</title>
</head>
<body>
    <h4 id="helloText">Hello to the Telephone book</h4>
    <div id="mainContainer" class="container">
        <button id="simpleBtn" type="button" class="btn btn-default">Простая кнопочка</button>
    </div>
</body>
</html>