<%@ page import ="com.cms.deloitte.model.Customer"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Customer customer = new Customer(); %>
<%=session.getAttribute("custDetails") %>

</body>
</html>