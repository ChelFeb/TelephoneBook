<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--<script type="text/javascript" src="<c:url value="/resources/js/jquery-2.1.0.min.js" />"></script>--%>
<script type="text/javascript" src="<c:url value="/resources/js/jquery_lightxox/jquery.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.lightbox_me.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/main.js" />"></script>
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
<div class="row">
    <div id="mainContainer" class="container">
        <input name="searchInitial" class="select2-default" id="search" type="text" placeholder="Найти контакт..."
               autocomplete="off">
        <button id="simpleBtn" type="button" class="btn btn-default">Добавить контакт</button>

        <table class="table-hover table-striped table-condensed">
            <thead>
            <tr>
                <th>Initials</th>
                <th>Phone number</th>
            </tr>
            </thead>
            <c:forEach items="${personList}" var="element">
                <tbody>
                <tr>
                    <td>${element.initials}</td>
                    <td>${element.phoneNumber}</td>
                    <td>
                        <button class="fuzzy deleteBtn" class="btn-danger" userId="${element.id}">delete</button>
                    </td>
                </tr>
                </tbody>
            </c:forEach>
        </table>
    </div>
</div>

<form role="form" action="<c:url value="/deletePerson" />" method="POST">
    <input id="deletePerson" type="submit" class="hidden" name="deletePersonId" class="form-control"
           type="text"> </input>
</form>


<div id="addPerson" class="popup">
    <form role="form" class="form-horizontal" action="<c:url value="/addPerson" />" method="POST">
        <legend>Add person</legend>

        <div class="form-group">
            <label for="personInitial" class="control-label col-lg-2">
                Initial
            </label>

            <div class="col-lg-10">
                <input id="personInitial" name="personInitial" class="form-control" type="text"/>
            </div>
        </div>

        <div class="form-group">
            <label for="personTelephone" class="control-label col-lg-2">
                Telephone
            </label>

            <div class="col-lg-10">
                <input id="personTelephone" name="personTelephone" class="form-control" type="text"/>
            </div>
        </div>

        <div>
            <button type="submit" class="btn btn-primary">Добавить</button>
        </div>
    </form>

</div>
</body>
</html>