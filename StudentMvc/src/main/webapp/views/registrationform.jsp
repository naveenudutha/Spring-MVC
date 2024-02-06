<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>

<h2>Registration Form</h2>

<form:form  action="register"  modelAttribute="student">
      <table>
      <form:hidden path="studentId"/>
          <tr>
              <td>Student Name:</td>
              <td><form:input path="studentName" /></td>
          </tr>
          <tr>
              <td>City:</td>
              <td><form:input path="city" /></td>
          </tr>
          <tr>
              <td colspan="2">
                  <input type="submit" value="Register" />
              </td>
          </tr>
      </table>
  </form:form>

</body>
</html>