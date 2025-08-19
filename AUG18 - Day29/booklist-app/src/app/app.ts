import { Component, signal } from '@angular/core';
import { HomeComponent } from './home/home';   

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [HomeComponent],                    
  templateUrl: './app.html',
  styleUrls: ['./app.css']
})
export class App {
  protected readonly title = signal('booklist-app');
}
