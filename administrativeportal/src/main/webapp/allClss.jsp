<%@page import="com.simplilearn.ph2.dto.Classes"%>
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

				<h3>Classes</h3>
  	<%
 	Set<Classes> clss = (Set<Classes>)session.getAttribute("allClasses");
  	%>
  		<table border="5">
  			<tr>
  				<th> Section </th>
  				<th> Subject </th>
  				<th> Teacher </th>
  				<th> Time </th>
  				<th> Students_List </th>
  			</tr>
  	<%
  		for (Classes classes:clss){
  	%>
  		<tr>
  			<td> <%= classes.getSection() %></td>
  			<td> <%= classes.getSubject() %></td>
  			<td> <%= classes.getTeacher() %></td>
  			<td> <%= classes.getTime() %></td>
  			<td> <%= classes.getStudents_list() %></td>
  			</tr>
  	<%	
  	}
  	%>
	</table>
</body>
</html>