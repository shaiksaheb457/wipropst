const quizData = [
    {
        question: "What is the capital of France?",
        options: ["Berlin", "Paris", "Madrid", "Rome"],
        answer: "Paris"
    },
    {
        question: "Which planet is known as the Red Planet?",
        options: ["Venus", "Mars", "Jupiter", "Saturn"],
        answer: "Mars"
    },
    {
        question: "Who wrote 'Hamlet'?",
        options: ["Charles Dickens", "Mark Twain", "William Shakespeare", "Jane Austen"],
        answer: "William Shakespeare"
    }
];

let currentQuestion = 0;

const questionEl = document.getElementById("question");
const optionsEl = document.getElementById("options");
const feedbackEl = document.getElementById("feedback");
const nextBtn = document.getElementById("nextBtn");

function loadQuestion() {
    feedbackEl.textContent = "";
    const q = quizData[currentQuestion];
    questionEl.textContent = q.question;
    optionsEl.innerHTML = "";
    q.options.forEach(option => {
        const btn = document.createElement("button");
        btn.textContent = option;
        btn.classList.add("option");
        btn.onclick = () => checkAnswer(option);
        optionsEl.appendChild(btn);
    });
}

function checkAnswer(selected) {
    if (selected === quizData[currentQuestion].answer) {
        feedbackEl.textContent = "Correct!";
        feedbackEl.style.color = "green";
    } else {
        feedbackEl.textContent = "Wrong!";
        feedbackEl.style.color = "red";
    }
}

nextBtn.onclick = () => {
    currentQuestion++;
    if (currentQuestion < quizData.length) {
        loadQuestion();
    } else {
        questionEl.textContent = "Quiz Completed!";
        optionsEl.innerHTML = "";
        feedbackEl.textContent = "";
        nextBtn.style.display = "none";
    }
};

loadQuestion();
