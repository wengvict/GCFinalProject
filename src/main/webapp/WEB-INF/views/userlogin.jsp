<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login</title>
</head>
<body>
<form action="createuser">
<h1>Please enter your 4 digit user ID for your garden inventory</h1>
User Id<input type="text" name="userid" required>
<input type="hidden" name="clientid">
<input type="hidden" name="scientificname" value=${ pName }>
<input type="submit" value="submit">
</form>
</body>
</html>