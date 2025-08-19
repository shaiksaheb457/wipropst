import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-ngstyle-demo',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './ngstyle-demo.html',
  styleUrls: ['./ngstyle-demo.css']
})
export class NgStyleDemoComponent {
  // Dynamic style properties
  fontSize = '20px';
  fontColor = 'purple';
  bgColor = 'lightyellow';
  padding = '10px';
  borderRadius = '5px';
}
