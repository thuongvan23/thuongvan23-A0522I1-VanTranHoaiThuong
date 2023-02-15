<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <form action="show1" method="post">
        Eng:
        <label>
            <input type="text" name="eng1" value="${eng}">
        </label>
        <button type="submit">Translate</button>
    </form>
    Result: ${viet}
</body>
</html>