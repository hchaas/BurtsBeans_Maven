
<%@page import="java.util.List"%>
<%@page import="edu.wctc.dj.burtsbeans.model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

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
                    <li><a href="shoppingcart.html">Shopping Cart</a></li>
                </ul>
            </nav>
            <main>
                <div>
                    <h2>Burt's Coffee Beans</h2>
                    //<c:out value="${name.id}"/>">
                    <%  
                        Product product = (Product)request.getAttribute("product");
  
                    %>
                    
                    <h3> Product Detail - <%= product.getProductName()%></h3>

                    <%--details to be added later--%>
                    
                    <center><p><%= product.getProductDescription()%></p></center>
        
                   
                    
                    </body>



                </div>
            </main>
            <footer>
                Copyright &copy; 2018 Burt's Beans Wholesale Coffee<br>
                <a href="mailto:haleyhaas@burtsbeans.com">haleyhaas@burtsbeans.com</a>
            </footer>
        </body>
    </div>
</html>

