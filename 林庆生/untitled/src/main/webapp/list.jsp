<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<html>
<head>
    <title>学生信息</title>
</head>
<body><center>
<table border="1">
    <tr>
        <th>姓名</th>
        <th>语文成绩</th>
        <th>数学成绩</th>
        <th>Action</th>
    </tr>
    <c:forEach items="${students }" var="student">
        <tr>
            <td>${student.name}</td>
            <td>${student.chineseScore}</td>
            <td>${student.mathScore}</td>
            <td>
                <form action="DeleteStudentServlet" method="post">
                    <input type="hidden" name="name" value="${student.name}">
                    <input type="submit" value="Delete">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
<form action="AddStudentServlet" method="post">
    Name: <input type="text" name="name"><br>
    Chinese Score: <input type="text" name="chineseScore"><br>
    Math Score: <input type="text" name="mathScore"><br>
    <input type="submit" value="Add">
</form></center>
</body>
</html>