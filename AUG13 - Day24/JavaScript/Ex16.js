const images = [
    "1.jpg",
    "2.jpg",
    "3.jpg",
    "4.jpg",
    "airpods.jpg"
];

let currentIndex = 0;
const galleryImage = document.getElementById("galleryImage");

function showImage(index) {
    galleryImage.src = images[index];
}

document.getElementById("prev").addEventListener("click", () => {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    showImage(currentIndex);
});

document.getElementById("next").addEventListener("click", () => {
    currentIndex = (currentIndex + 1) % images.length;
    showImage(currentIndex);
});

showImage(currentIndex);
