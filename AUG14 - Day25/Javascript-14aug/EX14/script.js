document.getElementById('loginBtn').addEventListener('click', () => {
    let userId = document.getElementById('userId').value;
    let password = document.getElementById('password').value;

    if (userId && password) {
        localStorage.setItem('userId', userId);
        document.getElementById('status').textContent = `Logged in as ${userId}`;
    } else {
        alert("Please enter both User ID and Password");
    }
});

document.getElementById('logoutBtn').addEventListener('click', () => {
    localStorage.removeItem('userId');
    document.getElementById('status').textContent = "Logged out";
});
