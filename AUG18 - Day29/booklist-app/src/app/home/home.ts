import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';   

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CommonModule],                        
  templateUrl: './home.html',
  styleUrls: ['./home.css']
})
export class HomeComponent {
  books = [
    { title: 'Book 1', image: 'https://covers.openlibrary.org/b/id/7222246-L.jpg', description: 'This is book 1 description' },
    { title: 'Book 2', image: 'https://covers.openlibrary.org/b/id/8228691-L.jpg', description: 'This is book 2 description' },
    { title: 'Book 3', image: 'https://covers.openlibrary.org/b/id/7222246-L.jpg', description: 'This is book 3 description' },
    { title: 'Book 4', image: 'https://covers.openlibrary.org/b/id/8081536-L.jpg', description: 'This is book 4 description' },
    { title: 'Book 5', image: 'https://covers.openlibrary.org/b/id/5551061-L.jpg', description: 'This is book 5 description' },
    { title: 'Book 6', image: 'https://covers.openlibrary.org/b/id/8231856-L.jpg', description: 'This is book 6 description' },
    { title: 'Book 7', image: 'https://covers.openlibrary.org/b/id/6979861-L.jpg', description: 'This is book 7 description' },
    { title: 'Book 8', image: 'https://covers.openlibrary.org/b/id/7222276-L.jpg', description: 'This is book 8 description' },
    { title: 'Book 9', image: 'https://covers.openlibrary.org/b/id/8100901-L.jpg', description: 'This is book 9 description' },
    { title: 'Book 10', image: 'https://covers.openlibrary.org/b/id/8773271-L.jpg', description: 'This is book 10 description' },
    { title: 'Book 11', image: 'https://covers.openlibrary.org/b/id/8225231-L.jpg', description: 'This is book 11 description' },
    { title: 'Book 12', image: 'https://covers.openlibrary.org/b/id/8100762-L.jpg', description: 'This is book 12 description' },
    { title: 'Book 13', image: 'https://covers.openlibrary.org/b/id/6979866-L.jpg', description: 'This is book 13 description' },
    { title: 'Book 14', image: 'https://covers.openlibrary.org/b/id/8100767-L.jpg', description: 'This is book 14 description' },
    { title: 'Book 15', image: 'https://covers.openlibrary.org/b/id/8225269-L.jpg', description: 'This is book 15 description' },
    { title: 'Book 16', image: 'https://covers.openlibrary.org/b/id/8081531-L.jpg', description: 'This is book 16 description' },
    { title: 'Book 17', image: 'https://covers.openlibrary.org/b/id/5551034-L.jpg', description: 'This is book 17 description' },
    { title: 'Book 18', image: 'https://covers.openlibrary.org/b/id/8235087-L.jpg', description: 'This is book 18 description' },
    { title: 'Book 19', image: 'https://covers.openlibrary.org/b/id/7222161-L.jpg', description: 'This is book 19 description' },
    { title: 'Book 20', image: 'https://covers.openlibrary.org/b/id/8100940-L.jpg', description: 'This is book 20 description' }
  ];
}
