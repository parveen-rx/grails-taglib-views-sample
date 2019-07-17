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
    <p>The table represent the all student details using custom tag lib</p>
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
            <ctl:renderCustomTable studentList="${studentList}"/>
        </tbody>
    </table>
</div>
<g:render template="/common/copyright"/>
<asset:javascript src="application.js"/>
</body>
</html>