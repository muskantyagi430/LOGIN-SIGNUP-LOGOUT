<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logout</title>
<link rel="stylesheet" href="welcome.css">
</head>
<body>

<%
    // Invalidate the session
    session.invalidate();
%>

<p>You have been logged out.</p>
<p><a href="login.jsp">Login Again</a></p>

</body>
</html>
