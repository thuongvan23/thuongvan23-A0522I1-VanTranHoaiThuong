<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>INDEX</title>
</head>
<body>
    <h1>TỜ KHAI Y TẾ</h1>
    <form:form modelAttribute="report" action="save" method="post">
        Ten: <form:input path="name"/><br>
        Nam sinh:
        <form:select path="yob" >
            <c:forEach begin="1900" end="2022" step="1" var="year">
                <form:option value="${year}">${year}</form:option>
            </c:forEach>
        </form:select>
        Gioi tinh:
        <form:select path="gender" items="${genders}"/>
        Quoc tich:
        <form:select path="nationality" items="${nationalities}"/>
        CCCD:
        <form:input path="idCard"/><br>
        Thong tin di chuyen:
        <form:radiobuttons path="movingInfo" items="${vehicles}"/><br>
        So hieu phuong tien:
        <form:input path="idVehicle"/>
        So cho ngoi:
        <form:input path="seat"/>
        Ngay bat dau:
        <form:input path="dayStart"/>
        Ngay ket thuc:
        <form:input path="dayEnd"/><br>
        Nhung noi da den trong 14 ngay:
        <form:input path="placesHaveHadVisitedSince14DayBefore"/><br>
        Địa chỉ liên lạc <br>

<%--        <form:form modelAttribute="homeAddress" action="save" method="post">--%>
            Dia chi lien he:
            <form:input path="homeAddress.detailAddress" name=""/>
            Email:
            <form:input path="homeAddress.email"/>
            So dien thoai:
            <form:input path="homeAddress.phoneNumber"/>
<%--        </form:form>--%>

        Dau hieu nghi van:
        <form:checkboxes path="signalsOfSick" items="${signals}"/><br>
        Lich su tuong tac:
        <form:checkboxes path="historyContact" items="${histories}"/><br>
        <button type="submit">Submit</button>
        <button type="reset">Reset</button>
    </form:form>
</body>
</html>