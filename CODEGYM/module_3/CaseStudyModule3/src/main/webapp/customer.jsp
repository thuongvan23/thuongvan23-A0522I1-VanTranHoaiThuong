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
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        .header-banner {
            background-color: #333;
            background-image: url('https://37.media.tumblr.com/8b4969985e84b2aa1ac8d3449475f1af/tumblr_n3iftvUesn1snvqtdo1_1280.jpg');
            background-position: center;
            background-repeat: no-repeat;
            background-size: cover;
            width: 100%;
            height: 150px;
        }
    </style>
    <link rel="stylesheet" href="main1.css">
    <link rel="stylesheet" href="bootstrap.css">
</head>
<body>
<div id="header">
    <div class="header-banner">
        <h1>Furama Resort</h1>
    </div>
    <div class="clear"></div>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="MainServlet">Home</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Employee
                        </a>
                        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="MainServlet?action=showAllEmployee">List</a></li>
                            <li><a class="dropdown-item" href="MainServlet?action=createEmployee">Create</a></li>
                            <li><a class="dropdown-item" href="#">Update</a></li>
                            <li><hr class="dropdown-divider"></li>
                            <li><a class="dropdown-item" href="#">Delete</a></li>
                        </ul>
                    </li>

                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Customer
                        </a>
                        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="MainServlet?action=showAllCustomer">List</a></li>
                            <li><a class="dropdown-item" href="MainServlet?action=createCustomer">Create</a></li>
                            <li><a class="dropdown-item" href="#">Update</a></li>
                            <li><hr class="dropdown-divider"></li>
                            <li><a class="dropdown-item" href="#">Delete</a></li>
                        </ul>
                    </li>

                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Service
                        </a>
                        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="#">List</a></li>
                            <li><a class="dropdown-item" href="MainServlet?action=createNewService">Create</a></li>
                            <li><a class="dropdown-item" href="#">Update</a></li>
                            <li><hr class="dropdown-divider"></li>
                            <li><a class="dropdown-item" href="#">Delete</a></li>
                        </ul>
                    </li>

                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Contract
                        </a>
                        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="#">List</a></li>
                            <li><a class="dropdown-item" href="MainServlet?action=createContract">Create</a></li>
                            <li><a class="dropdown-item" href="#">Update</a></li>
                            <li><hr class="dropdown-divider"></li>
                            <li><a class="dropdown-item" href="#">Delete</a></li>
                        </ul>
                    </li>

                </ul>
                <form class="d-flex">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
            </div>
        </div>
    </nav>
</div>
<div id="sidebar">

</div>
<div id="main">
    <div class="main-content">
        <h1>Create new Customer</h1>
            <form class="row g-3" action="${pageContext.request.contextPath}/MainServlet" method="post">
                <div class="col-md-6">
                    <label for="inputEmail4" class="form-label">Customer ID</label>
                    <input type="email" class="form-control" id="inputEmail4" name="customerId">
                </div>
                <div class="col-md-6">
                    <label for="inputPassword4" class="form-label">Full Name</label>
                    <input type="password" class="form-control" id="inputPassword4" name="fullName">
                </div>
                <div class="col-12">
                    <label for="inputAddress" class="form-label">Day of birth</label>
                    <input name="birthday" type="text" class="form-control" id="inputAddress" placeholder="year-month-day" style="width: 50%">
                </div>
                <div class="col-12">
                    <label for="inputAddress2" class="form-label">Address</label>
                    <input name="address" type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor" style="width: 50%">
                </div>
                <div class="col-md-6">
                    <label for="inputCity" class="form-label">Identify card</label>
                    <input name="idCard" type="text" class="form-control" id="inputCity">
                </div>
                <div class="col-md-6">
                    <label for="inputCity" class="form-label">Phone number</label>
                    <input name="phoneNumber" type="text" class="form-control" id="inputPhoneNumber">
                </div>
                <div class="col-md-2">
                    <label for="inputZip" class="form-label">Email</label>
                    <input name="email" type="text" class="form-control" id="inputZip">
                </div>
                <div class="col-md-4">
                    <label for="inputState" class="form-label">Customer Type</label>
                    <select name="customerType" id="inputState" class="form-select">
                        <option selected>Choose...</option>
                        <option value="Diamond">Diamond</option>
                        <option value="Platinum">Platinum</option>
                        <option value="Gold">Gold</option>
                        <option value="Silver">Silver</option>
                        <option value="Member">Member</option>
                    </select>
                </div>
                <div class="col-md-4">
                    <label for="inputState" class="form-label">Gender</label>
                    <select id="inputGender" class="form-select" name="gender">
                        <option selected>Choose...</option>
                        <option value="1">Male</option>
                        <option value="0">Female</option>
                        <option value="2">Other</option>
                    </select>
                </div>
                <div class="col-12" style="margin-top: 10px">
                    <button type="submit" class="btn btn-primary">Sign in</button>
                </div>
                <input type="hidden" name="action" value="createCustomer">
            </form>
    </div>
</div>
<div id="footer">

</div>

<script type="text/javascript" src="bootstrap.js"></script>
</body>
</html>
