<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Update Form</title>
<link type=text/css rel="stylesheet" href="./css/style.css">
<link type=text/css rel="stylesheet" href="./css/add-customer-style.css">
</head>
<body>

	<div id="wrapper">
		<div id="header">
				<h1> Student Update Form</h1>
		
		</div>
	</div>
	<form:form action="register" modelAttribute="student">
      <table>
      
      		<form:hidden path="studentId"/>
      		<tr>
      		<th>Name</th>
      		<td><form:input path="studentName"/></td>
      		</tr>
      		
      		 <tr>
      		<th>City</th>
      		<td><form:input path="city"/></td>
      		</tr>
      		
			      		
      		<tr>
      		<td><input type="submit" value="SignUp"></td>
      		</tr>
          
      </table>
  </form:form>
	

</body>
</html>