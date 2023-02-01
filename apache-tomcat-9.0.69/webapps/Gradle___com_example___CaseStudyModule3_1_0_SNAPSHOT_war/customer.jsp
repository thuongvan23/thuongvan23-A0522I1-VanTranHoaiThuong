<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 12/2/2022
  Time: 2:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new Customer</title>
    <link rel="stylesheet" href="bootstrap.css">
</head>
<body>
    <h1>Create new Customer</h1>
    <form action="${pageContext.request.contextPath}/MainServlet" method="post">
        <form class="row g-3">
            <div class="col-md-6">
                <label for="inputEmail4" class="form-label">Email</label>
                <input type="email" class="form-control" id="inputEmail4">
            </div>
            <div class="col-md-6">
                <label for="inputPassword4" class="form-label">Password</label>
                <input type="password" class="form-control" id="inputPassword4">
            </div>
            <div class="col-12">
                <label for="inputAddress" class="form-label">Address</label>
                <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St">
            </div>
            <div class="col-12">
                <label for="inputAddress2" class="form-label">Address 2</label>
                <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">
            </div>
            <div class="col-md-6">
                <label for="inputCity" class="form-label">City</label>
                <input type="text" class="form-control" id="inputCity">
            </div>
            <div class="col-md-4">
                <label for="inputState" class="form-label">State</label>
                <select id="inputState" class="form-select">
                    <option selected>Choose...</option>
                    <option>...</option>
                </select>
            </div>
            <div class="col-md-2">
                <label for="inputZip" class="form-label">Zip</label>
                <input type="text" class="form-control" id="inputZip">
            </div>
            <div class="col-12">
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" id="gridCheck">
                    <label class="form-check-label" for="gridCheck">
                        Check me out
                    </label>
                </div>
            </div>
            <div class="col-12">
                <button type="submit" class="btn btn-primary">Sign in</button>
            </div>
        </form>
    </form>
<%--    <form>--%>
<%--        <label for="exampleDataList" class="form-label">Datalist example</label>--%>
<%--        <input class="form-control" list="datalistOptions" id="exampleDataList" placeholder="Type to search...">--%>
<%--        <datalist id="datalistOptions">--%>
<%--            <option value="San Francisco">--%>
<%--            <option value="New York">--%>
<%--            <option value="Seattle">--%>
<%--            <option value="Los Angeles">--%>
<%--            <option value="Chicago">--%>
<%--        </datalist>--%>
<%--    </form>--%>
    <script type="text/javascript" src="bootstrap.js"></script>
</body>
</html>
