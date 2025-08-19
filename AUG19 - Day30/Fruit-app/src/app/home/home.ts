// import { Component } from '@angular/core';
// import { DisplayListComponent } from '../display-list/display-list';

// @Component({
//   selector: 'app-home',
//   standalone: true,
//   imports: [DisplayListComponent],
//   templateUrl: './home.html',
//   styleUrls: ['./home.css']
// })
// export class HomeComponent {}


// import { Component } from '@angular/core';
// import { DisplayListComponent } from '../display-list/display-list';
// import { StyleDemoComponent } from '../style-demo/style-demo';

// @Component({
//   selector: 'app-home',
//   standalone: true,
//   imports: [DisplayListComponent, StyleDemoComponent],
//   templateUrl: './home.html',
//   styleUrls: ['./home.css']
// })
// export class HomeComponent {}



// import { Component } from '@angular/core';
// import { DisplayListComponent } from '../display-list/display-list';
// import { StyleDemoComponent } from '../style-demo/style-demo';
// import { FunctionNgClassComponent } from '../function-ngclass/function-ngclass';

// @Component({
//   selector: 'app-home',
//   standalone: true,
//   imports: [DisplayListComponent, StyleDemoComponent, FunctionNgClassComponent],
//   templateUrl: './home.html',
//   styleUrls: ['./home.css']
// })
// export class HomeComponent {}


// import { Component } from '@angular/core';
// import { DisplayListComponent } from '../display-list/display-list';
// import { StyleDemoComponent } from '../style-demo/style-demo';
// import { FunctionNgClassComponent } from '../function-ngclass/function-ngclass';
// import { NgStyleDemoComponent } from '../ngstyle-demo/ngstyle-demo';

// @Component({
//   selector: 'app-home',
//   standalone: true,
//   imports: [
//     DisplayListComponent,
//     StyleDemoComponent,
//     FunctionNgClassComponent,
//     NgStyleDemoComponent
//   ],
//   templateUrl: './home.html',
//   styleUrls: ['./home.css']
// })
// export class HomeComponent {}


// import { Component } from '@angular/core';
// import { CommonModule } from '@angular/common';   
// import { FruitComponent } from '../fruit/fruit';

// @Component({
//   selector: 'app-home',
//   standalone: true,
//   imports: [CommonModule, FruitComponent],   
//   templateUrl: './home.html',
//   styleUrls: ['./home.css']
// })
// export class HomeComponent {
//   fruits = [
//     {
//       name: 'Apple',
//       image: 'https://upload.wikimedia.org/wikipedia/commons/1/15/Red_Apple.jpg',
//       description: 'Crisp and sweet, great for snacks and pies.'
//     },
//     {
//       name: 'Banana',
//       image: 'https://upload.wikimedia.org/wikipedia/commons/8/8a/Banana-Single.jpg',
//       description: 'Soft and creamy, full of potassium.'
//     },
//     {
//       name: 'Orange',
//       image: 'https://upload.wikimedia.org/wikipedia/commons/c/c4/Orange-Fruit-Pieces.jpg',
//       description: 'Juicy citrus packed with vitamin C.'
//     },
//     {
//       name: 'Strawberry',
//       image: 'https://upload.wikimedia.org/wikipedia/commons/2/29/PerfectStrawberry.jpg',
//       description: 'Bright and tangy, perfect with cream.'
//     },
//     {
//       name: 'Grapes',
//       image: 'https://upload.wikimedia.org/wikipedia/commons/3/36/Kyoho-grape.jpg',
//       description: 'Small, sweet, and great for sharing.'
//     }
//   ];
// }



import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FruitComponent } from '../fruit/fruit';
import { IFruit } from '../fruit/IFruit';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CommonModule, FruitComponent],
  templateUrl: './home.html',
  styleUrls: ['./home.css']
})
export class HomeComponent {
  fruits: IFruit[] = [
    { id: 1, name: 'Apple', image: 'https://upload.wikimedia.org/wikipedia/commons/1/15/Red_Apple.jpg', description: 'Crisp and sweet, great for snacks and pies.' },
    { id: 2, name: 'Banana', image: 'https://upload.wikimedia.org/wikipedia/commons/8/8a/Banana-Single.jpg', description: 'Soft and creamy, full of potassium.' },
    { id: 3, name: 'Orange', image: 'https://upload.wikimedia.org/wikipedia/commons/c/c4/Orange-Fruit-Pieces.jpg', description: 'Juicy citrus packed with vitamin C.' },
    { id: 4, name: 'Strawberry', image: 'https://upload.wikimedia.org/wikipedia/commons/2/29/PerfectStrawberry.jpg', description: 'Bright and tangy, perfect with cream.' },
    { id: 5, name: 'Grapes', image: 'https://upload.wikimedia.org/wikipedia/commons/3/36/Kyoho-grape.jpg', description: 'Small, sweet, and great for sharing.' }
  ];

  // 👇 Remove by ID
  removeFruit(id: number) {
    this.fruits = this.fruits.filter(fruit => fruit.id !== id);
  }
}

