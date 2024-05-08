
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
    <centre><img src="logo.jpeg" alt="Elexnova Logo" width="200"></centre>
        <h2>Login</h2>
        <form  action="loginservlet" method="post">
            <div class="input-group">
                <label for="username">Username</label>
                <input type="text" id="username" name="username" required>
            </div>
            

            <div class="input-group">
                <label for="phone no">Phone no</label>
                <input type="tel" id="no" name="Phone_no" required>
            </div>
            <div class="input-group">
                <label for="Email">Email</label>
                <input type="text" id="password" name="Email" required>
            </div>
           
            <button type="submit">Login</button>
        </form>
        <%String error=request.getParameter("error");
                		if(error!=null&&error.equals("1")){
                		%>   
                		
                		<p style="color:red;">Invalid Username</p>
                		
                		<% 
                		
                		
                		}
        %>
        <p>Don't have an account? <a href="signup.jsp">Sign up</a></p>
    </div>
</body>
</html>
    