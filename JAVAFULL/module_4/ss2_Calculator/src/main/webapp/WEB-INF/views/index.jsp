<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Calculator</h1>
<form action="calculate" method="post">
    <label>
        <input type="number" name="num1" value="${num1}">
        <input type="number" name="num2" value="${num2}">
    </label>
    <button type="submit" name="operator" value="add">Add</button>
    <button type="submit" name="operator" value="minor">Minor</button>
    <button type="submit" name="operator" value="multi">Multi</button>
    <button type="submit" name="operator" value="div">Div</button>
</form>
Result: ${result}
</body>
</html>