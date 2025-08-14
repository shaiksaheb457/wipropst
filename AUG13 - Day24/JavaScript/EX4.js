function updateCount() {
            let input = document.getElementById("myInput");
            let remaining = 50 - input.value.length;
            document.getElementById("charCount").innerText = remaining + " characters remaining";
        }