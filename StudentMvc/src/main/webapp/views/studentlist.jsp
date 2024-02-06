<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Home</title>
</head>
<body>

<h2>Student List</h2>
<a href="/StudentApp/showForm">Register</a>

		<table>
			<tr>
				<th>Student Id</th>
				<th>Student Name</th>
				<th>Student City</th>
				<th>Update Data</th>
				<th>Delete Data</th>
			</tr>
			
				<c:forEach items="${list}" var="student">
					<c:url var="UpdateLink" value="/updateForm">
						<c:param name="studentId" value="${student.studentId}"></c:param>
					</c:url>
					
					<c:url var="DeleteLink" value="/deleteData">
						<c:param name="studentId" value="${student.studentId}"></c:param>
					</c:url>
					
					<tr>
						<td>${student.studentId}</td>
						<td>${student.studentName}</td>
						<td>${student.city}</td>
						<th><a href="${UpdateLink }">Update</a></th>
						<th><a href="${DeleteLink }">Delete</a></th>
					</tr>
				</c:forEach>
		
				
			
		</table>



</body>
</html>