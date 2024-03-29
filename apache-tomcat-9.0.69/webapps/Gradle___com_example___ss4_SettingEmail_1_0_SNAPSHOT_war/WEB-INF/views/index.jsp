<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>INDEX</title>
</head>
<body>
    <h1>Setting</h1>
    <from:form modelAttribute="valueSetting" action="save" method="post">
        Language:
        <from:select path="language" items="${languages}">
            <option value="${languages[0]}">English</option>
            <option value="${languages[1]}">VietNames</option>
            <option value="${languages[2]}">Chinese</option>
            <option value="${languages[3]}">Japanese</option>
        </from:select>
        Page size:
        <form:select path="pageSize">
            <c:forEach begin="1" end="100" step="1" var="num">
                <from:option value="${num}">${num}</from:option>
            </c:forEach>
        </form:select>
        Spams Filter: <form:checkbox path="spamsFilter"/><br>
        Signature: <form:input path="signature"/><br>
    </from:form>
</body>
</html>