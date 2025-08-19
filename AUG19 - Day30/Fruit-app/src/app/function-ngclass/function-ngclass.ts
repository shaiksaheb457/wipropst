import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-function-ngclass',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './function-ngclass.html',
  styleUrls: ['./function-ngclass.css']
})
export class FunctionNgClassComponent {
  // Boolean flags for demonstration
  isBlue = true;
  isGreen = true;

  // Function to return an object with class names
  getNgClass() {
    return {
      'text-blue': this.isBlue,
      'bg-lightgreen': this.isGreen
    };
  }
}



