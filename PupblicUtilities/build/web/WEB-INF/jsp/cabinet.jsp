<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <title>кабинет пользователя</title>
        <meta charset="UTF-8">


        <style>


            body {
                height: 80vh;
                display: flex;
                align-items: center;
                justify-content: center;
            }

            section{
                display: flex;
                justify-content: center;
                align-items: center;
            }

            form {
                margin-bottom: 10px;
            }

            input[type="text"] {
                width: 200px;
                padding: 5px;
                border: 1px solid #ccc;
                border-radius: 4px;
            }

            input[type="submit"] {
                padding: 10px 20px;
                background-color: #669;
                color: white;
                border: none;
                border-radius: 4px;
                cursor: pointer;
                transition: all 0.4s ease;
            }

            input[type="submit"]:hover {
                opacity: 0.9;
            }

            .button-wrapper {
                display: flex;
                align-items: center;
            }

            .button-wrapper input[type="submit"] {
                margin-left: 10px;
            }
        </style>

    </head>
    <body>
        <section>
            <container>
                <h1>Добро пожаловать, ${name}!</h1>

                <form action="roomsCountServlet" method="post">
                    <input type="text" name="avg"/>

                    <input type="submit" value="количество комнат"/>
                </form>


                <form action="floorServlet" method="post">
                    <input type="text" name="avg"/>
                    <input type="submit" value="количество комнат и интервал этажей"/>
                </form>


                <form action="squareServlet" method="post">
                    <input type="text" name="avg"/>
                    <input type="submit" value="площадь"/>
                </form>


                <form action="WelcomeServlet">
                    <input type="hidden" name="logout" value="true"/>
                    <input type="submit" value="Назад"/>
                </form>     
            </container>
        </section>
    </body>
</html>
