<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 11/26/2022
  Time: 11:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
  <h1>ListBook</h1>
  <table>
    <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Author</th>
      <th>Category</th>
    </tr>
    <c:forEach items="${books}" var="book">
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
