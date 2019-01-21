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
    <title>Gucci Store</title>
</head>
<body>
    <H1 class="head">Авторизуйтесь</H1>
    <div class="menu">
    <form method="post" action="login">
    <table>
        <tr>

            <div><label for="loginField">Логин</label></div>
            <div><input id="loginField" type="text" name="login"></div>
        </tr>
        <tr>
            <div><label for="passwordField">Пароль</label></div>
            <div><input id="passwordField" type="password" name="password"></div>
        </tr>
        <tr>
            <input type="submit" value="Войти">
            <div style="text-align: center"><a href="reg">Регистрация</a></div>


        </tr>
    </table>
    </form>
</div>
</body>
</html>