<%@page import="com.simplilearn.ph2.dto.Students"%>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

				<h3>Students</h3>

	<%
 	Set<Students> stud = (Set<Students>)session.getAttribute("allStudents");
  	%>
  		<table border="5">
  			<tr>
  				<th> Id </th>
  				<th> Firstname </th>
  				<th> Lastname </th>
  				<th> Age </th>
  				<th> Class </th>
  			</tr>
  	<%
  		for (Students students:stud){
  	%>
  		<tr>
  			<td> <%= students.getId() %></td>
  			<td> <%= students.getFname() %></td>
  			<td> <%= students.getLname() %></td>
  			<td> <%= students.getAge() %></td>
  			<td> <%= students.getAclass() %></td>
  			</tr>
  	<%	
  	}
  	%>
	</table>
</body>
</html>