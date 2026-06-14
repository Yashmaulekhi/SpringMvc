<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>
 <h3 class ="text-center">${Header }</h3>
 <h3 class ="text-center">${Desc }</h3>
<h1>Your name is ${user.name}</h1>
<h1>Your email is ${user.email}</h1>
<h1>Your password is ${user.password}</h1>
</body>
</html>