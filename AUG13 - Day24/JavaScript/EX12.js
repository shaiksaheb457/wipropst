function isPalindrome(str) {
      let cleaned = str.toLowerCase().replace(/[^a-z0-9]/g, '');
      return cleaned === cleaned.split('').reverse().join('');
    }

    function checkPalindrome() {
      let text = document.getElementById('textInput').value;
      let result = isPalindrome(text) ? "Yes, it's a palindrome!" : "No, it's not a palindrome.";
      document.getElementById('result').innerText = result;
    }