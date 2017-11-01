<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%= 2*5 %>
<h1>Time</h1>
<%= new java.util.Date() %>
<br/>
Is 25 greater than 50? <%= 25>50 %>
<br/>
<%= 25>2? 4 : 23 %>

<%
//This is a comment in a scriplet
int age = 12;
out.println("I am " + age + " years old");

if (15 > 10){
	out.println("15 is the bigger number");
}
out.println("<br/>");
for (int i=0; i<10; i++){
	out.println("<br/>");
	out.println("We love JSP" + i);
	
}

%>

</body>
</html>