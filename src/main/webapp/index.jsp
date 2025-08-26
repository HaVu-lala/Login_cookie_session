<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <h2>Login Form</h2>
    <form action="CookieLoginServlet" method="post">
        <label>Username:</label>
        <input type="text" name="username" /><br/>
        <label>Password:</label>
        <input type="password" name="password" /><br/>
        <input type="submit" value="Login with Cookie"/>
    </form>
    <br/>
    <form action="SessionLoginServlet" method="post">
        <label>Username:</label>
        <input type="text" name="username" /><br/>
        <label>Password:</label>
        <input type="password" name="password" /><br/>
        <input type="submit" value="Login with Session"/>
    </form>
</body>
</html>
