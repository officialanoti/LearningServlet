<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int test = 10;
/*
Declaration tag is mainly for method declaration and for variables with access modifiers other than default
*/
%>
<%= test %>
<%!
private int test;
protected String yes = "Yes!";
%>
<%= yes%>
<br/>
<%!
	String message(){
		return "USL";
	}
%>

<%= message() %>

</body>
</html>