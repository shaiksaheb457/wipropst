import { Component, Input, Output, EventEmitter } from '@angular/core';
import { CommonModule } from '@angular/common';   // 👈 Import this
import { IFruit } from '../fruit/IFruit';

@Component({
  selector: 'app-display-list',
  standalone: true,
  imports: [CommonModule],   // 👈 Add this
  template: `
    <div class="card" style="width: 18rem;" *ngFor="let fruit of fruits">
      <img [src]="fruit.image" class="card-img-top" alt="{{fruit.name}}">
      <div class="card-body">
        <h5 class="card-title">{{ fruit.name }}</h5>
        <p class="card-text">{{ fruit.description }}</p>
        <button class="btn btn-danger" (click)="removeFruit(fruit.id)">Remove</button>
      </div>
    </div>
  `
})
export class DisplayList {
  @Input() fruits: IFruit[] = [];
  @Output() fruitRemoved = new EventEmitter<number>();

  removeFruit(id: number) {
    this.fruitRemoved.emit(id);
  }
}
