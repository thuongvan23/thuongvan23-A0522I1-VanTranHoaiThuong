<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 12/4/2022
  Time: 4:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        .header-banner {
            background-color: #333;
            background-image: url('https://37.media.tumblr.com/8b4969985e84b2aa1ac8d3449475f1af/tumblr_n3iftvUesn1snvqtdo1_1280.jpg');
            background-position: center;
            background-repeat: no-repeat;
            background-size: cover;
            width: 100%;
            height: 200px;
        }
    </style>
    <link rel="stylesheet" href="obj1/bootstrap.css">
    <link rel="stylesheet" href="obj1/Layout.css">
</head>
<body>
<div id="header">
    <div class="header-banner">
        <h1>CREATE</h1>
    </div>
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
                            <li><a class="dropdown-item" href="MainServlet?action=list">List</a></li>
                            <li><a class="dropdown-item" href="MainServlet?action=create">Create</a></li>
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
                            <li><a class="dropdown-item" href="#">List</a></li>
                            <li><a class="dropdown-item" href="#">Create</a></li>
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
                            <li><a class="dropdown-item" href="#">Create</a></li>
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
                            <li><a class="dropdown-item" href="#">Create</a></li>
                            <li><a class="dropdown-item" href="#">Update</a></li>
                            <li><hr class="dropdown-divider"></li>
                            <li><a class="dropdown-item" href="#">Delete</a></li>
                        </ul>
                    </li>

                </ul>
                <form class="d-flex" action="/MainServlet" method="post">
                    <input name="searchInput" id="search" class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                    <input type="hidden" name="action" value="search">
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
            </div>
        </div>
    </nav>
</div>

<div id="sidebar">
</div>

<div id="main">
    <div class="main-content" id="form-create">
        <h1>Create New Object</h1>
        <form class="row g-3" action="/MainServlet" method="post">
            <div class="col-md-6">
                <label for="inputEmail4" class="form-label">Student ID</label>
                <input type="text" class="form-control" id="inputEmail4" name="id">
            </div>
            <div class="col-md-6">
                <label for="inputPassword4" class="form-label">Full Name</label>
                <input type="text" class="form-control" id="inputPassword4" name="name">
            </div>
            <div class="col-12">
                <label for="inputAddress" class="form-label">Day of birth</label>
                <input name="birthday" type="date" class="form-control" id="inputAddress" placeholder="yyyy-MM-dd" style="width: 50%">
            </div>
            <div class="col-12">
                <label for="inputAddress2" class="form-label">Age</label>
                <input name="age" type="text" class="form-control" id="inputAddress2" style="width: 50%">
            </div>
            <div class="col-md-4">
                <label for="inputState" class="form-label">Student Type</label>
                <select name="studentTypeId" id="inputState" class="form-select">
                    <option selected>Choose...</option>
                    <option value="1">Good</option>
                    <option value="2">Normal</option>
                    <option value="3">Bad</option>
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
            <div class="col-12" style="margin-top: 20px">
                <button type="submit" class="btn btn-primary">Sign in</button>
            </div>
            <input type="hidden" name="action" value="create">
        </form>
    </div>
</div>

<div id="footer">
</div>
<script type="text/javascript" src="obj1/bootstrap.js"></script>
</body>
</html>
