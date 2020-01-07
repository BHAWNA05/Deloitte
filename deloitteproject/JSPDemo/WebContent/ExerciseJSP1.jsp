
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Date now = new Date(); %>
<h2>Server date and time is <%=now %></h2>
<%String username=request.getParameter("username");
  String color[]= request.getParameterValues("color");
  int selectedColor = color.length;%>

<% for(int i=0;i<selectedColor;i++)
{%>
	<font color =<%=color[i]%>><%= "Hello" + username %></font><br/>
	<% 
}
%>

</body>
</html>