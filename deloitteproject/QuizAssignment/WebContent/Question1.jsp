<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Answer1">
<%out.println("WELCOME : "   + "  " + session.getAttribute("username"));%>
<ol>
<li>
Which of this keyword can be used in a subclass to call the constructor of superclass?
</li>
</ol>
<ol>
<li > <input type="radio" name="option" value="Super" >Super</br>
 <input type="radio" name="option" value="This" >This</br>
 <input type="radio" name="option" value="Extent" >Extent</br>
 <input type="radio" name="option" value="Extends" >Extends</br>
 </li>
</ol>

</ol>
<input type="submit" name="submit" value="NEXT">
</form>
</body>

</html>