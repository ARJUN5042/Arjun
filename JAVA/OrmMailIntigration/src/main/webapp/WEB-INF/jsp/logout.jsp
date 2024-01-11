<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
        .disable-back {
            display: none;
        }
    </style>
    <script>
        if (window.history && window.history.pushState) {
            window.history.pushState(null, null, window.location.href);
            window.onpopstate = function () {
                window.history.pushState(null, null, window.location.href);
            };
        }
        document.addEventListener("DOMContentLoaded", function () {
            var disableBackFlag = sessionStorage.getItem("disableBack");
            if (disableBackFlag) {
                document.querySelector(".disable-back").style.display = "block";
                
                setTimeout(function(){
                	window.location.href="login";
                }, 3000);
            }
        });

        // Set sessionStorage flag on unload to prevent back button on the next visit
        window.addEventListener("unload", function () {
            sessionStorage.setItem("disableBack", "true");
        });
    </script>
</head>
<body>
<div class="disable-back">
        <p>You have successfully logged out. Going back is disabled.</p>
        <p>Redirecting to login page...</p>
    </div>
</body>
</html>