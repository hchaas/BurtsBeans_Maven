<%-- 
    Document   : shoppingcart
    Created on : Feb 20, 2018, 6:18:03 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE HTML>
<html lang="en">
    <div id="wrapper">
        <head>
            <link href="storefront.css" rel="stylesheet">
            <link href="https://fonts.googleapis.com/css?family=Roboto:300,400" rel="stylesheet">
            <title>Burt's Beans Wholesale Coffee</title>
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js">
            </script>
        </head>

        <body>
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
            <main>
                <h2>Shopping Cart</h2>
                <center><p>The following items have been saved in your shopping cart:</p></center>
                <table>
                    <tr>
                        <td>
                            Breakfast Blend
                        </td>
                        <td>
                            2
                        </td>
                        <td>
                            <fmt:formatNumber value="${product.pricePerPound}"/>  
                        </td>
                </table>
                <br>
                <center><input type="Submit" value="Complete Order"></center>

            </main>
            <footer>
                Copyright &copy; 2018 Burt's Beans Wholesale Coffee<br>
                <a href="mailto:haleyhaas@burtsbeans.com">haleyhaas@burtsbeans.com</a>
            </footer>
        </body>
    </div>
</html>


