<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Index</title>
</head>
<body>
    <form action="/conversion/change1">
        <h1>Currency Conversion</h1>
        <label>
            Rate:
            <input type="text" name="rate" value="${rate}">
        </label>
        <label>
            Usd:
            <input type="text" name="usd" value="${usd}">
        </label>
        <button type="submit">Change</button>
    </form>
    Result: ${result}
</body>
</html>