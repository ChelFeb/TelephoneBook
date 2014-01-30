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
    <div id="headWelcome" class="text-info">
        <h4 id="helloText">Hello to the Telephone book</h4>
    </div>
    <div id="mainContainer" class="container">
        <button id="simpleBtn" type="button" class="btn btn-default" >Добавить контакт</button>
        <input id="search" type="text" placeholder="Найти контакт...">

        <div id="bookBlock">
            <div  id="alphabetSearch" class="btn-group btn-group-vertical">
                <button class="btn">А</button>
                <button class="btn">Б</button>
                <button class="btn">В</button>
                <button class="btn">Г</button>
            </div>
            <table class="table-hover table-striped table-condensed">
            <thead>
                <tr>
                    <th>Initials</th>
                    <th>Phone number</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Anton Romankov Olegovich</td>
                    <td>0675407488</td>
                </tr>
                <tr>
                    <td>Anton</td>
                    <td>0675407488</td>
                </tr>
                <tr>
                    <td>Anton</td>
                    <td>0675407488</td>
                </tr>
            </tbody>
        </table>
        </div>
    </div>
</body>
</html>