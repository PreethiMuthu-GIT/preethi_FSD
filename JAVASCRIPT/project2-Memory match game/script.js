const landingPage = document.querySelector('.landing-page');
const gameContainer = document.querySelector('.game-container');
const cardsGrid = document.querySelector('.cards-grid');
const scoreDisplay = document.getElementById('score');
const timerDisplay = document.getElementById('timer');
const gameOverScreen = document.querySelector('.game-over');
const finalScoreDisplay = document.getElementById('final-score');
const playAgainButton = document.getElementById('play-again');

let cards = [];
let flippedCards = [];
let score = 0;
let timer;
let timeLeft = 30;

const categories = {
    fruits: ['🍎', '🍌', '🍇', '🍓', '🍊', '🍉', '🍍', '🥭'],
    emojis: ['😃', '😍', '🤩', '😎', '🥳', '😜', '🤪', '😇'],
    animals: ['🐶', '🐱', '🐭', '🐹', '🐰', '🦊', '🐻', '🐼'],
    planets: ['🪐', '🌍', '🌕', '🌞', '🌙', '🌌', '🌠', '🌖'],
    flags: ['🇺🇸', '🇬🇧', '🇨🇦', '🇯🇵', '🇫🇷', '🇩🇪', '🇮🇳', '🇧🇷']
};

document.querySelectorAll('.category-buttons button').forEach(button => {
    button.addEventListener('click', () => {
        const category = button.getAttribute('data-category');
        startGame(category);
    });
});

function startGame(category) {
    landingPage.classList.add('hidden');
    gameContainer.classList.remove('hidden');
    cards = shuffle([...categories[category], ...categories[category]]);
    createCards(cards);
    score = 0;
    scoreDisplay.textContent = score;
    timeLeft = 30;
    timerDisplay.textContent = timeLeft;
    startTimer();
}

function createCards(cards) {
    cardsGrid.innerHTML = '';
    cards.forEach((card, index) => {
        const cardElement = document.createElement('div');
        cardElement.classList.add('card');
        cardElement.dataset.index = index;

        const front = document.createElement('div');
        front.classList.add('front');
        front.textContent = card;

        const back = document.createElement('div');
        back.classList.add('back');

        cardElement.appendChild(front);
        cardElement.appendChild(back);
        cardElement.addEventListener('click', flipCard);
        cardsGrid.appendChild(cardElement);
    });
}

function flipCard() {
    if (flippedCards.length < 2 && !this.classList.contains('flipped')) {
        this.classList.add('flipped');
        flippedCards.push(this);
        if (flippedCards.length === 2) {
            checkMatch();
        }
    }
}

function checkMatch() {
    const [card1, card2] = flippedCards;
    if (card1.textContent === card2.textContent) {
        card1.classList.add('matched');
        card2.classList.add('matched');
        score += 10;
        scoreDisplay.textContent = score;
        if (score === cards.length * 5) {
            endGame(true);
        }
    } else {
        setTimeout(() => {
            card1.classList.remove('flipped');
            card2.classList.remove('flipped');
        }, 1000);
    }
    flippedCards = [];
}

function startTimer() {
    timer = setInterval(() => {
        timeLeft--;
        timerDisplay.textContent = timeLeft;
        if (timeLeft === 0) {
            endGame(false);
        }
    }, 1000);
}

function endGame(isWin) {
    clearInterval(timer);
    gameContainer.classList.add('hidden');
    gameOverScreen.classList.remove('hidden');
    finalScoreDisplay.textContent = score;
    if (isWin) {
        gameOverScreen.querySelector('h2').textContent = 'You Win!';
    } else {
        gameOverScreen.querySelector('h2').textContent = 'Game Over!';
    }
}

playAgainButton.addEventListener('click', () => {
    gameOverScreen.classList.add('hidden');
    landingPage.classList.remove('hidden');
});

function shuffle(array) {
    for (let i = array.length - 1; i > 0; i--) {
        const j = Math.floor(Math.random() * (i + 1));
        [array[i], array[j]] = [array[j], array[i]];
    }
    return array;
}
