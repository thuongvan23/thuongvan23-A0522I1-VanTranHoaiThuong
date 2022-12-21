<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 11/25/2022
  Time: 3:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display List Book</title>
</head>
<body>
  <h1>List Book</h1>
  <table border="1">
    <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Author</th>
      <th>Category</th>
    </tr>
    <c:forEach items="${books}" var = "book">
      <tr>
        <td>${book.id}</td>
        <td>${book.name}</td>
        <td>${book.author}</td>
        <td>${book.category.name}</td>
      </tr>
    </c:forEach>
  </table>

</body>
</html>
