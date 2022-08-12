<%@page import="java.util.Set"%>
<%@page import="com.simplilearn.ph2.dto.Subjects"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

				<h3>Subjects</h3>
<%
 	Set<Subjects> subs = (Set<Subjects>)session.getAttribute("allSubjects");
  	%>
  		<table border="3">
  			<tr>
  				<th> Id </th>
  				<th> Name </th>
  				<th> Shortcut </th>
  				
  			</tr>
  	<%
  		for (Subjects subjects:subs){
  	%>
  		<tr>
  			<td> <%= subjects.getId() %></td>
  			<td> <%= subjects.getName() %></td>
  			<td> <%= subjects.getShortcut() %></td>
  			
  			</tr>
  	<%	
  	}
  	%>
	</table>
</body>
</html>