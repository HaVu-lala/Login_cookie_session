<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <h2>Welcome Page</h2>
    <p>
        Xin chào: <%= request.getAttribute("username") != null ? request.getAttribute("username") : session.getAttribute("username") %>
    </p>
    <a href="index.jsp">Đăng xuất</a>
</body>
</html>
