<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up Page</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
    <img src="logo.jpeg" alt="Elexnova Logo" width="200">
        <h2>Sign Up</h2>
        <form id="signupForm" method="post" action="signupservlet">
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
            <button type="submit">Sign Up</button>
        </form>
        <p>Already have an account? <a href="login.jsp">Login</a></p>
    </div></body>
</html>