// import { Component, Input } from '@angular/core';
// import { CommonModule } from '@angular/common';

// @Component({
//   selector: 'app-fruit',
//   standalone: true,
//   imports: [CommonModule],
//   templateUrl: './fruit.html',
//   styleUrls: ['./fruit.css']
// })
// export class FruitComponent {
//   @Input() name!: string;
//   @Input() image!: string;
//   @Input() description!: string;
// }


// import { Component, Input } from '@angular/core';
// import { CommonModule } from '@angular/common';
// import { IFruit } from '../fruit/IFruit'; 

// @Component({
//   selector: 'app-fruit',
//   standalone: true,
//   imports: [CommonModule],
//   templateUrl: './fruit.html',
//   styleUrls: ['./fruit.css']
// })
// export class FruitComponent {
//   @Input() fruit!: IFruit; 
// }



import { Component, Input } from '@angular/core';
import { CommonModule } from '@angular/common';
import { IFruit } from './IFruit';

@Component({
  selector: 'app-fruit',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './fruit.html',
  styleUrls: ['./fruit.css']
})
export class FruitComponent {
  @Input() fruit!: IFruit;
}

