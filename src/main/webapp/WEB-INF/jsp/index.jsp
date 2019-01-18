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
                    <a >Валентин Бертович</a>
                    <button style="margin-top: 15px">Выйти</button>
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

    <div class="sticky">
        <H1 class="head">Одежда:</H1>
    </div>
            <div class="menu" >
           <c:forEach var="product" items="${product}">
<div class="img">
                            <img
                            src="https://media.gucci.com/style/DarkGray_South_0_160_316x316/1533573005/547834_0Y2BT_8163_001_092_0000_Light--Gucci.jpg" alt="">
                    </div>

                                   <div class="product" id="${product.getId()}">

                                       <div class="name">${product.getName()}</div>
                                       <div class="cost">${product.getCost()}</div>
                                   </div>

                           </div>
                       </c:forEach>

</div>
    <div class="sticky">
      <h1 class="head">Аксессуары:</h1>
    </div>
            <div class="menu">
                <div class="clother">
                    <div class="img">
                            <img
                            src="https://media.gucci.com/style/DarkGray_South_0_160_316x316/1533573005/547834_0Y2BT_8163_001_092_0000_Light--Gucci.jpg" alt="">
                    </div>
                    <div class="text">text5</div>
                    <div class="bar" style="display: none;">
                        <div class="cost" style="display: inline; margin: 0">10001

                        </div>
                        <span>Rub</span>
                        <button type="button" class="add">В корзину</button>
                    </div>
                </div>
                <div class="clother">
                    <div class="img">
                            <img
                            src="https://www.studio-fashion.com/image/cache/data/2016-05/muzhskoy-remen-gucci-s-zolotoy-pryazhkoy-25628-2000x2000.jpg" alt="">
                    </div>
                    <div class="text">text6</div>
                    <div class="bar" style="display: none;">
                        <div class="cost" style="display: inline; margin: 0">10003

                        </div>
                        <span>Rub</span>
                        <button type="button" class="add">В корзину</button>
                    </div>
                </div>
                <div class="clother">
                    <div class="img">
                            <img
                            src="http://merchiumru.gcdn.co/users/64743/images/detailed/4/gucciremen7-1000x1340.jpg?t=1529481878" alt="">
                    </div>
                    <div class="text">text7</div>
                    <div class="bar" style="display: none;">
                        <div class="cost" style="display: inline; margin: 0">10004

                        </div>
                        <span>Rub</span>
                        <button type="button" class="add">В корзину</button>
                    </div>
                </div>
                <div class="clother">
                    <div class="img">
                            <img
                            src="https://cdn-images.farfetch-contents.com/13/35/04/13/13350413_15086980_300.jpg" alt="">
                    </div>
                    <div class="text">text8</div>
                    <div class="bar" style="display: none;">
                        <div class="cost" style="display: inline; margin: 0">10005

                        </div>
                        <span>Rub</span>
                        <button type="button" class="add">В корзину</button>
                    </div>
                </div>
        </div>
        <div class="footer">
            <div class="text">&copy;Футер</div>
                </div>
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
                <script src="/js/click.js"></script>
                <script src="/js/addItem.js"></script>
</body>
</html>