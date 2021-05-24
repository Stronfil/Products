 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
</head>
<body>
<h1>All products</h1>
<ul>
    <c:forEach var="product" items="${productList}">
        <p>${product.id}, ${product.title}, ${product.cost} </p>
    </c:forEach>

</ul>
</body>
</html>