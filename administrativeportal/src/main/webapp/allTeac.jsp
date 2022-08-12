<%@page import="com.simplilearn.ph2.dto.Teachers"%>
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

				<h3>Teachers</h3>
	<%
 	Set<Teachers> teac = (Set<Teachers>)session.getAttribute("allTeachers");
  	%>
  		<table border="4">
  			<tr>
  				<th> Id </th>
  				<th> Firstname </th>
  				<th> Lastname </th>
  				<th> Age </th>
  				
  			</tr>
  	<%
  		for (Teachers teachers:teac){
  	%>
  		<tr>
  			<td> <%= teachers.getId() %></td>
  			<td> <%= teachers.getFname() %></td>
  			<td> <%= teachers.getLname() %></td>
  			<td> <%= teachers.getAge() %></td>
  			
  			</tr>
  	<%	
  	}
  	%>
	</table>
</body>
</html>