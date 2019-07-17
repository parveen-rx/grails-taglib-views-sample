<%--
  Created by Parveen Soni
  User: Parveen
  Date: 7/18/2019
  Time: 2:52 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Student List</title>
    <asset:stylesheet href="application.css"/>
</head>
<body>
<div class="container">
    <h2>Student List</h2>
    <p>The table represent the all student details without using custom taglib</p>
    <table class="table table-hover">
        <thead>
            <tr>
                <th>Name</th>
                <th>Age</th>
                <th>Gender</th>
                <th>City</th>
                <th>Country</th>
            </tr>
        </thead>
        <tbody>
            <g:each var="student" in="${studentList}">
                <tr>
                    <td>${student.name}</td>
                    <td>${student.age}</td>
                    <td>${student.gender}</td>
                    <td>${student.city}</td>
                    <td>${student.country}</td>
                </tr>
            </g:each>
        </tbody>
    </table>
</div>
<g:render template="/common/copyright"/>
<asset:javascript src="application.js"/>
</body>
</html>