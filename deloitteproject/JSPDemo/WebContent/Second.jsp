<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!int num1=200; %>
<%String name="BHAWNA";
int num2=200;%>
<h1>Deloitte Welcome you</h1>
<h1>Printed via SCRIPLET :</h1> <%out.println("Welcome" + " " + name); %><br/>
<h1>Printed via EXPRESSIONS :</h1> <%= "Welcome" +name %><br/>
Sum of two numbers <%= num1+num2 %>

</body>
</html>