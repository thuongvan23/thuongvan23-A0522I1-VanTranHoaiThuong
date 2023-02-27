<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 12/5/2022
  Time: 2:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <link rel="stylesheet" href="obj1/Layout.css">
    <link rel="stylesheet" href="obj1/bootstrap.css">
</head>
<body>
<div id="header">
    <div class="header-banner">
        <h1>SEARCH</h1>
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
    <h2>Table Name</h2>
    <table class="table table-hover">
        <thead>
        <th scope="col">Ma benh nhan</th>
        <th scope="col">Ma benh an</th>
        <th scope="col">Ten benh nhan</th>
        <th scope="col">Ngay nhap vien</th>
        <th scope="col">Ngay ra vien</th>
        <th scope="col">Li do nhap vien</th>
        <th scope="col"></th>
        <th scope="col"></th>
        </thead>
        <tbody>
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</ td>
                <td>${student.age}</td>
                <td>${student.birthday}</td>
                <td>${student.gender}</td>
                <td>${student.studentType.type}</td>
                        <td style="width: 94px"><button type="button" class="btn btn-secondary"><a style="text-decoration: none; color: black" href="MainServlet?action=update&id=${student.id}">Update</a></button></td>
                        <td style="width: 94px"><button type="button" class="btn btn-secondary"><a style="text-decoration: none; color: black" href="MainServlet?action=delete&id=${student.id}">Delete</a></button></td>
            </tr>
        </tbody>
    </table>
</div>
<div id="footer">

</div>

<script type="text/javascript" src="obj1/bootstrap.js"></script>
</body>
</html>
