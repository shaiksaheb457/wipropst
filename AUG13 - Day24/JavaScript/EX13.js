document.addEventListener("DOMContentLoaded", function () {
    const email = document.getElementById("email");
    const password = document.getElementById("password");
    const emailError = document.getElementById("emailError");
    const passwordError = document.getElementById("passwordError");
    const form = document.getElementById("loginForm");

    function validateEmail() {
        const emailValue = email.value.trim();
        const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        if (emailValue === "") {
            emailError.textContent = "Email is required";
            return false;
        } else if (!emailPattern.test(emailValue)) {
            emailError.textContent = "Invalid email format";
            return false;
        }
        emailError.textContent = "";
        return true;
    }

    function validatePassword() {
        const passwordValue = password.value.trim();
        if (passwordValue === "") {
            passwordError.textContent = "Password is required";
            return false;
        }
        passwordError.textContent = "";
        return true;
    }


    email.addEventListener("blur", validateEmail);
    password.addEventListener("blur", validatePassword);

    form.addEventListener("submit", function (e) {
        e.preventDefault();
        const emailValid = validateEmail();
        const passwordValid = validatePassword();
        if (emailValid && passwordValid) {
            alert("Login Successful!");
        }
    });
});
