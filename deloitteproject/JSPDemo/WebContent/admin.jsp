
<%@page import="com.Sum"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome Admin
<%
Sum sum = new Sum();
%>

<%= sum.addNumbers(11,122) %>
<%=session.getAttribute("cust") %>

</body>
</html>