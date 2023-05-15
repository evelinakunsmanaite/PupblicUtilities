<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ошибка</title>
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

            input[type="submit"] {
                padding: 10px 20px;
                background-color: #669;
                color: white;
                border: none;
                border-radius: 4px;
                cursor: pointer;
            }   
        </style>  
    </head>
    <body>
        <section>
            <container>
                <h1 style='color:red;'>${error}</h1>
                <form action="WelcomeServlet">
                    <input type="submit" value="Назад"/>
                </form>     
        </section>
    </container>
</body>
</html>
