<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
 <%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Hello </h2><br>
<h2>Id : ${student.id }</h2><br>
<h2>Name : ${student.name }</h2><br>
<h2>Marks : ${student.marks }</h2><br>
<hr>
<%-- <h2>retrieving collection from the application</h2>
<ul>${list.get(0)}</ul>
<ul>${list.get(1)}</ul>
<ul>${list.get(2)}</ul>
<ul>${list.get(3)}</ul> --%>

<c:forEach var="student" items="${list }">${student }<br></c:forEach>





</body>
</html>