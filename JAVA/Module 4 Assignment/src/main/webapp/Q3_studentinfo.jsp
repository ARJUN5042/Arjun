<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Information</title>
</head>
<body>
<h1>Student Information</h1>
<form method="post" action="Q3_StudentInfoAndPrintInConsole">
<label>First Name: </label>
<input type="text" name="firstname" placeholder="Enter Your Name"><br><br>
<label>Last Name: </label>
<input type="text" name="lastname" placeholder="Enter Your Surname"><br><br>
<label>Email: </label>
<input type="email" name="email" placeholder="Enter Valid Email Id"><br><br>
<label>Mobile No.: </label>
<input type="text" name="mobile" placeholder="Enter Your Mobile Number"><br><br>
<label>Gender: </label>
<input type="radio" name="gender" value="male">Male
<input type="radio" name="gender" value="female">Female<br><br>
<label>Password: </label>
<input type="password" name="password" placeholder="Enter Your Password"><br><br>
<input type="submit" name="action" value="Submit">
</form>
</body>
</html>