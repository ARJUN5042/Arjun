<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment</title>
<style type="text/css">
	.bttnStyle
	{
		background-color: lightblue;
		border-radius: 0.50rem;
		border:1px solid transperent;
	}
</style>
<script type="text/javascript">
	var xhttp=new XMLHttpRequest();
	var RazorpayOrderId;
	function CreateOrderID()
	{
		alert("1");
		var number=document.getElementById("amount").value;
		var bid=document.getElementById("bid").value;
		xhttp.open("GET","http://localhost:8080/E-Services_Project/OrderCreation?amount="+number+"&bid="+bid,false);
		alert("2");
		xhttp.send();
		RazorpayOrderId=xhttp.responseText;
		  
		/* alert(number);  
		OpenCheckOut(number); */
		OpenCheckOut();
	}
</script>
<script src="https://checkout.razorpay.com/v1/checkout.js"></script>
<script type="text/javascript">
	function OpenCheckOut()
	{
		alert("3");
		var number=document.getElementById("amount").value;
		alert(number);
		var options={
				"key":"rzp_test_sPhCuuWP15dnn6",
				"amount":number,
				"currency":"INR",
				"name":"Services",
				"description":"Payment for Booked Services",
				"order_id":RazorpayOrderId,
				"callback_url":"http://localhost:8080/E-Services_Project/OrderCreation",
				//optional
				"prefill":{
					"name":"Arjun Hirpara",
					"email":"hirparaarjun49@gmail.com",
					"contact":"7383851940"
				},
				"notes":{
					"address":"Ahmedabad"
				},
				"theme":{
					"color":"#3399cc"
				}
				
				
		};
		var rzp1=new Razorpay(options);
		rzp1.on('payment.failed',function (response){
			alert(response.error.code);
	        alert(response.error.description);
	        alert(response.error.source);
	        alert(response.error.step);
	        alert(response.error.reason);
	        alert(response.error.metadata.order_id);
	        alert(response.error.metadata.payment_id);
		});
		rzp1.open();
	    /* e.preventDefault(); */
	}
</script>
</head>
<body>
<div id="order_id">
	
</div>
<center>
	<%
		String price=request.getParameter("price");
		String bid=request.getParameter("bid");
	%>
	<input type="hidden" id="amount" value="<%=price%>">
	<input type="hidden" id="bid" value="<%=bid %>">
	<button id="payButton" onclick="CreateOrderID()" class="bttnStyle">Pay Now</button>
</center>
</body>
</html>