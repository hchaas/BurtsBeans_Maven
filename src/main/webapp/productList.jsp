
<%@page import="edu.wctc.dj.burtsbeans.model.Product"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="storefront.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Roboto:300,400" rel="stylesheet">
        <title>Burt's Beans Wholesale Coffee</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="http://html5shim.googlecode.com/svn/trunk/html5.js">
        </script>
    </head>
    <title>Product List</title>
</head>

<header>
    <img src="logo.png"/>
</header>
<nav>
    <ul>
        <li><a href="index.html">Home</a></li>
        <li><a href="products.html">Our Beans</a></li>
        <li><a href="requestinfoform.html">Request Details</a>
        <li><a href="shoppingcart.jsp">Shopping Cart</a></li>
    </ul>
</nav>

<body>

    <table>
        <c:forEach var="product" items="${productList}">

            <tr>
                <td>
                    <a href="?id=<c:out value="${product.productID}"/>"><c:out value="${product.productName}"/></a>
                </td>
                <td>
                    <fmt:setLocale value = "en_US"/>
                    <fmt:formatNumber value = "${product.pricePerPound}" type = "currency"/>
                </td>
            </tr>

        </c:forEach>

    </table>


</body>
</html>
