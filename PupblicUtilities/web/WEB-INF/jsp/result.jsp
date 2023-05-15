<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table {
                margin-left: auto;
                margin-right: auto;
                margin-top: 250px;
            }
            th {
                font-size: 13px;
                font-weight: normal;
                background: #b9c9fe;
                border-top: 4px solid #aabcfe;
                border-bottom: 1px solid white;
                color: #039;
                padding: 8px;
            }
            td {
                background: #e8edff;
                border-bottom: 1px solid white;
                color: #669;
                border-top: 1px solid transparent;
                padding: 8px;
            }
            tr:hover td {
                background: #ccddff;
            }
            form {
                margin-left: 100px;


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
        <c:choose>
            <c:when test="${not empty result}">
                <table>

                    <thead>
                    <th>id</th>
                    <th>apartmentNumber</th>
                    <th>apartmentArea</th>
                    <th>floor</th>
                    <th>roomsCount</th>
                    <th>street</th>
                    <th>buildingType</th>
                    <th>lifetime</th>
                </thead>
                <c:forEach var="ab" items="${result}">
                    <tr>
                        <td>${ab.id}</td>
                        <td>${ab.apartmentNumber}</td>
                        <td>${ab.apartmentArea}</td>
                        <td>${ab.floor}</td>
                        <td>${ab.roomsCount}</td>
                        <td>${ab.street}</td>
                        <td>${ab.buildingType}</td>
                        <td>${ab.lifetime}</td>

                    </tr>
                </c:forEach>
            </table>
        </c:when>
        <c:otherwise>
            <c:out value="искомые данные отсутствуют" />
        </c:otherwise>
    </c:choose>
    <form action="WelcomeServlet">
        <input type="hidden" name="toCab" value="true"/>
        <input type="submit" value="Назад"/>
    </form> 
</body>
</html>
