// validation.js

document.addEventListener("DOMContentLoaded", function () {
    // Get the form element
    var form = document.getElementById("signupForm");

    if (form) {
        // Add a submit event listener to the form
        form.addEventListener("submit", function (event) {
            var isValid = validateForm();
            if (!isValid) {
                event.preventDefault();
            }
        });
    }

    function validateForm() {
        var isValid = true;

        // Get form fields
        var firstname = document.getElementById("firstname");
        var lastname = document.getElementById("lastname");
        var email = document.getElementById("email");
        var mobile = document.getElementById("mobile");
        var address = document.getElementById("address");
        var password = document.getElementById("password");
        var confirmPassword = document.getElementById("confirmPassword");

        // Get error message elements
        var emailError = document.getElementById("emailError");
        var passwordError = document.getElementById("passwordError");
        var confirmPasswordError = document.getElementById("confirmPasswordError");

        // Reset error messages
        emailError.textContent = "";
        passwordError.textContent = "";
        confirmPasswordError.textContent = "";

        // Validate email format
        var emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
        if (!email.value.match(emailPattern)) {
            emailError.textContent = "Invalid email format";
            isValid = false;
        }

        // Validate password and confirm password
        if (password.value.length < 6) {
            passwordError.textContent = "Password must be at least 6 characters";
            isValid = false;
        }

        if (password.value !== confirmPassword.value) {
            confirmPasswordError.textContent = "Passwords do not match";
            isValid = false;
        }

        return isValid;
    }
});
