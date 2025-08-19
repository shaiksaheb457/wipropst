import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-style-demo',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './style-demo.html',
  styleUrls: ['./style-demo.css']
})
export class StyleDemoComponent {
  // Boolean flags for object-based ngClass
  isRed = true;
  isYellow = true;
}
