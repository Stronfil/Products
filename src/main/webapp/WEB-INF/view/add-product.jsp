<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>
<h1>Add products</h1>

<form:form action="processForm" modelAttribute="product">
    <p>Id: <form:input path="id" /></p>
    <br>
    <p>Title: <form:input path="title" /></p>
    <br>
    <p>Cost: <form:input path="cost" /></p>
    <br>
    <p><input type="submit" value="Submit"/></p>
</form:form>
</body>
</html>