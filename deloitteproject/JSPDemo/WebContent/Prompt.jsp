<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String username = request.getParameter("username"); %>
<%if(username.equals("admin")) { %>

<jsp:forward page="admin.jsp"></jsp:forward>
<% } 
%>
<%= "Welcome" + " " + username %>
</body>

</html>