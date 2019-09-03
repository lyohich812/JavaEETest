<%--
  Created by IntelliJ IDEA.
  User: Alexey Pavlov
  Date: 01.09.2019
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show SomePackage.Cart</title>
</head>
<body>
    <%@ page import="SomePackage.Cart" %>
    <% Cart cart = (Cart) session.getAttribute("cart"); %>
    <p> Name: <%= cart.getName() %> </p>
    <p> Quantity: <%= cart.getQuantity() %> </p>

</body>
</html>
