<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="First.jsp" %><br/>
<h1><%= "This is current file" %></h1><br/>
<jsp:include page="Second.jsp"></jsp:include> 

</body>
</html>