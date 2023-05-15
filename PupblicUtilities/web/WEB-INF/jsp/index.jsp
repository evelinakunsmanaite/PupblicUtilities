<%-- 
    Document   : index
    Created on : 12 мая 2023 г., 16:37:28
    Author     : Administrator
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Форма авторизации</title>
        <meta charset="UTF-8">
        <c:url var="css" value="resources/css/myStyle.css"></c:url>
        <link rel="stylesheet" href="${css}" type="text/css"/>

    </head>
    <body>

        <section>
            <div class="form-box">
                <div class="container">
                    <div class="forms">
                        <div class="form login" >
                            <form action="WelcomeServlet" method="post" name="loginForm">
                                <span class="title">Войти</span>
                                <div class="input-field">
                                    <span
                                        class="error"
                                        id="usernameError"
                                        style="color: red"
                                        ></span
                                    ><br />
                                    <input
                                        type="text"
                                        id="username"
                                        name="login"
                                        placeholder="Введите логин"
                                        />

                                    <i class="fa-solid fa-user"></i>
                                </div>

                                <div class="input-field">
                                    <span
                                        class="error"
                                        id="passwordError"
                                        style="color: red"
                                        ></span
                                    ><br />

                                    <input
                                        type="password"
                                        id="password"
                                        name="pass"
                                        class="password"
                                        placeholder="Введите пароль"
                                        /><br />
                                    <span></span>
                                </div>
                                <div class="input-field button" >
                                    <input type="submit" value="Войти" />
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <script src="./main.js"></script>


    </body>
</html>
