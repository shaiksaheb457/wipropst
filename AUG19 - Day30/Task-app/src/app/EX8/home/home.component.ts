import { Component } from '@angular/core';
import { TaskListComponent } from '../task-list/task-list.component';
import { CommonModule } from '@angular/common';
import { ITask } from '../models/task.interface';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-home',  
  standalone: true,
  imports: [CommonModule, FormsModule, TaskListComponent],
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  tasks: ITask[] = [
    { id: 1, description: 'Prepare report', category: 'Work' },
    { id: 2, description: 'Math homework', category: 'Study' },
    { id: 3, description: 'Go for a walk', category: 'Exercise' }
  ];

  description: string = '';
  category: string = '';
  categories: string[] = ['Work', 'Study', 'Exercise', 'Other'];

  addTask() {
    if (this.description && this.category) {
      const newTask: ITask = {
        id: Date.now() + Math.floor(Math.random() * 1000),
        description: this.description,
        category: this.category
      };
      this.tasks.push(newTask);
      this.description = '';
      this.category = '';
    }
  }

  removeTask(id: number) {
    this.tasks = this.tasks.filter(t => t.id !== id);
  }
}
