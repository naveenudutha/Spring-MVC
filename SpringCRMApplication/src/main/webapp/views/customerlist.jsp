<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRM Home Page</title>
<link type=text/css rel="stylesheet" href="./css/style.css">
</head>
<body>
		
	<div id="wrapper">
		<div id="header">
				<h1> Customer Relationship Management Application</h1>
		
		</div>
	</div>
	
	<div id="container">
		<div id="content">
		<!-- <a href="/CRM/showform">Click here to Register</a> -->
		<input type="button" value="Register" class="add-button" onClick="window.location.href='/CRM/showform'";return false>
			<table border="1">
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>City</th>
						<th>Update Data</th>
						<th>Delete Data</th>
					</tr>
					<c:forEach items="${customers}" var="customer">
					<c:url var="UpdateLink" value="/updateForm">
						<c:param name="customerId" value="${customer.id}"></c:param>
					</c:url>
					
					<c:url var="DeleteLink" value="/deleteData">
					<c:param name="customerId" value="${customer.id}"></c:param>
					</c:url>
						<tr>
							<th>${customer.firstName}</th>
							<th>${customer.lastName}</th >
							<th>${customer.city}</th>
							<th><a href="${UpdateLink }">Update Data</a></th>
							<th><a href="${DeleteLink }">Delete Data</a></th>
						</tr>
					</c:forEach>
			
			</table>
		</div>
	</div>

</body>
</html>