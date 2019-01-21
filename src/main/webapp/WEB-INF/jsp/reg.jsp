<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored ="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="/css/style.css">
    <script src="jquery-3.3.1.min.js"></script>
    <script src="script.js"></script>
</head>

<body>
        <H1 class="head">Регистрация:</H1>
    <div class="menu">
        <div class="clother">
        <form action="index.html" target="_self" id="registration" onsubmit='checkPass()'>

            <input type="text" pattern="^[-_#0-9a-zA-Z]{3,}$" name="login" autocomplete="off" placeholder="login">
            <br>
            <input type="password" pattern=".{3,}" name="password" placeholder="password" required id="password">
            <br>
            <input type="submit" value="Зарегистрироваться">
            <br>
        </form>
        <a href="login">Авторизация</a>
    </div>
</div>
</body>

</html>