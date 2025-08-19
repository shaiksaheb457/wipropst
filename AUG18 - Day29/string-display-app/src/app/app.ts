// import { Component } from '@angular/core';
// import { FormsModule } from '@angular/forms';

// @Component({
//   selector: 'app-root',
//   standalone: true,
//   imports: [FormsModule],
//   templateUrl: './app.html',
//   styleUrls: ['./app.css']
// })
// export class AppComponent {
//   message: string = "Hello Angular!";

//   printMessage() {
//     console.log("Message from input:", this.message);
//   }
// }

// import { Component } from '@angular/core';

// @Component({
//   selector: 'app-root',
//   standalone: true,
//   templateUrl: './app.html',
//   styleUrls: ['./app.css']
// })
// export class AppComponent {
//   names: string[] = ["saheb", "hari", "sai", "latheef", "adil", "mallesh"];
// }


// import { Component } from '@angular/core';
// import { FormsModule } from '@angular/forms';   
// import { CommonModule } from '@angular/common';

// @Component({
//   selector: 'app-root',
//   standalone: true,
//   imports: [FormsModule, CommonModule],   
//   templateUrl: './app.html',
//   styleUrls: ['./app.css']
// })
// export class AppComponent {
//   showMessage: boolean = false;
// }


// import { Component } from '@angular/core';
// import { CommonModule } from '@angular/common';

// @Component({
//   selector: 'app-root',
//   standalone: true,
//   imports: [CommonModule],
//   templateUrl: './app.html',
//   styleUrls: ['./app.css']
// })
// export class AppComponent {
//   countryList: string[] = ['India', 'USA', 'UK', 'Germany', 'Australia'];

//   dropdownCountries: string[] = [];

//   loadCountries() {
//     this.dropdownCountries = this.countryList;
//   }
// }


// import { Component } from '@angular/core';
// import { CommonModule } from '@angular/common';
// import { FormsModule } from '@angular/forms';

// @Component({
//   selector: 'app-root',
//   standalone: true,
//   imports: [CommonModule, FormsModule],
//   templateUrl: './app.html',
//   styleUrls: ['./app.css']
// })
// export class AppComponent {
//   colors: string[] = ['Red', 'Blue', 'Green', 'Orange', 'Purple'];
//   selectedColor: string = 'Black';  
// }



// import { Component } from '@angular/core';
// import { CommonModule } from '@angular/common';
// import { FormsModule } from '@angular/forms';

// @Component({
//   selector: 'app-root',
//   standalone: true,
//   imports: [CommonModule, FormsModule],
//   templateUrl: './app.html',
//   styleUrls: ['./app.css']
// })
// export class AppComponent {
//   // List of names
//   names: string[] = [
//   'Jayanta', 'Jayaram', 'Ramesh', 'Suresh', 'Anjali', 'Priya', 'John', 'Joseph',
//   'Kiran', 'Rahul', 'Sneha', 'Amit', 'Deepak', 'Manoj', 'Kavita', 'Pooja',
//   'Arun', 'Vijay', 'Geeta', 'Lakshmi', 'Nikhil', 'Rohit', 'Meena', 'Rajesh',
//   'Sanjay', 'Divya', 'Shreya', 'Karthik', 'Vishal', 'Neha', 'Harsha', 'Mohan',
//   'Chandan', 'Gopal', 'Sunil', 'Prakash', 'Swati', 'Aarti', 'Varun', 'Preeti',
//   'Hemant', 'Nisha', 'Rekha', 'Ganesh', 'Akash', 'Yogesh', 'Pankaj', 'Santosh',
//   'Vivek', 'Sharath'
// ];

//   // User input for filtering
//   searchText: string = '';

//   // Getter: returns filtered names
//   get filteredNames(): string[] {
//     return this.names.filter(name =>
//       name.toLowerCase().includes(this.searchText.toLowerCase())
//     );
//   }
// }



