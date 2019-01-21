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
    <title>menu</title>
</head>
<body>
        <div class="header">
                <div class ="header-left">
                    <a >${user}</a>
                    <button style="margin-top: 15px"><a href="/login">Выйти</a></button>
                </div>

                <div class="overlay"></div>
                    <div class="popup" id="popup1">Окно поиска
                        <div class="closepopup"></div>
                    </div>
                <div class="overlay"></div>
                    <div class="popup" id="popup2">
                            <div id="shoppingCart">
                                    <div id="cartItemsContainer">
                                      <h2>Ваши покупки</h2>
                                      <div id="cartItems"></div>
                                      <div id="cost"></div>
                                      <div id="disc"></div>
                                      <div id="sale"></div>
                                      <button class="confirm" >Оформить</button>
                                      </div>
                          </div>
                        <div class="closepopup"></div>
                    </div>



                <div class="header-right">
                  <button class="search" id="search" >Поиск</button>
                  <button class="bucket" id="bucket">Корзина</button>
                  <button id="emptyCart">Очистить корзину</button>
                  <span id="itemCount" style="display: block;margin-left: 90px;"></span>
                </div>
                  </div>

<c:forEach var="category" items="${category}">
    <div class="sticky">
    <H1 class="head">${category.getName()}:</H1>
    </div>
        <div class="menu" >

            <c:forEach var="product" items="${category.getCategory()}">
                <div class="clother">
                    <div class="img">
                    <img
                    src="https://media.gucci.com/style/DarkGray_South_0_160_316x316/1533573005/547834_0Y2BT_8163_001_092_0000_Light--Gucci.jpg" alt="">
                    </div>

                        <div class="product" id="${product.getId()}">
                            <div class="text">${product.getName()}</div>

                            <div class="bar" style="display: none;">
                            <div class="cost"  style="display: inline; margin: 0">${product.getCost()}</div>
                            <span>Rub</span>
                            <button type="button" class="add">В корзину</button>
                            </div>
                    </div>

                </div>
            </c:forEach>

       </div>
        </c:forEach>

        <div class="footer">
            <div class="text">&copy;Футер</div>
                </div>
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
                <script src="/js/click.js"></script>
                <script src="/js/addItem.js"></script>
</body>
</html>