<%@page import="controller.LoginController"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%response.setHeader("Cache-Control", "no-store,no-cache,must-revalidate");%>
<%if(session.getAttribute("name").equals(null)) 
{
	response.sendRedirect("index.jsp");
	
	}
%>
welcome <%=session.getAttribute("name")%>


<form action="logout" method="post"><button type="submit"> logout</button></form>
</body>
</html>