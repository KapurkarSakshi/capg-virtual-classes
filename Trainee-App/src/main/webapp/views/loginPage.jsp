<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body >
    <form action="login" method="post">
    <h1>Login Page</h1>
        <table border="2">
             <tr><td>User Name </td><td><input type="text" name="username"></td></tr>
             <tr><td>Password  </td><td><input type="password" name="password"></td></tr>
             <tr><td><button type="submit">Login</button></td></tr>
        </table>
    </form>

</body>
</html>