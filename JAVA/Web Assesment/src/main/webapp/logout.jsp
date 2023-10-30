<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="Cache-Control" content="no-store" />
    <meta http-equiv="Pragma" content="no-cache" />
    <meta http-equiv="Expires" content="0" />
<title>Insert title here</title>
<!-- <script type="text/javascript">
	//disable the back button
	history.pushState(null,null,document.URL);
	window.addEventListner('popstate',function()
	{
		history.pushState(null,null,document.URL);
	});
	//redirect to login page
	setTimeout(function ()
			{
			window.location.href="login.jsp";
			},3000);
</script> -->
</head>
<body>
<p>You have been successfully logged out.
You will be redirected to login page shortly.</p>

<script>
        setTimeout(function () {
            window.location.href = "http://localhost:8080/WebAssesment/login.jsp"; // Replace "login.jsp" with your actual login page URL
        }, 2000);
    </script>
</body>
</html>