//function to handle registration form submission using AJAX
function registerUser()
{
	//Get form data
	var firstName=document.getElementById("firstName").value;
	var lastName=document.getElementById("lastName").value;
	var email=document.getElementById("email").value;
	var mobile=document.getElementById("mobile").value;
	var password=document.getElementById("password").value;
	
	//create a JSON object with form data
	
	var userData={
		firstName:firstName,
		lastName:lastName,
		email:email,
		mobile:mobile,
		password:password
	};
	
	//send an AJAX request to the server to register the user
	
	var xhr=new XMLHttpRequest();
	xhr.open("POST","registerUser",true);
	xhr.setRequestHeader("Content-Type","application/json;charset=UTF-8");
	
	xhr.onreadystatechange=function()
	{
		if(xhr.readyState===4&&xhr.status===200)
		{
			//Registration was successful
			var response=JSON.parse(xhr.responseText);
			if(response.success)
			{
				//display a success message or redirect to a success page
				alert("Registration Successful!!");
			}
			else
			{
				//display an error message
				alert("Registration failed. Email already in use.");
			}
		}
	};
	
	xhr.send(JSON.stringify(userData));
}

//attach the registerUser function to the form's submit event
document.getElementById("registerForm").addEventListener("submit",function(event)
{
	event.preventDefault();//prevent the default form submission
	registerUser();//call the registerUser function
});