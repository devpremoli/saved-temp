import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

import { Task } from './models/task.model';
import { CommonModule } from '@angular/common';
import { TaskListComponent } from './task-list/task-list.component';
import { TaskFormComponent } from './task-form/task-form.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, CommonModule, TaskListComponent, TaskFormComponent], // Components and modules go here
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  tasks: Task[] = [ // Use Task interface for type-checking
    { title: 'Learn Angular', completed: false },
    { title: 'Practice Data Binding', completed: false },
  ];

  addTask(newTask: Task) {
    this.tasks.push(newTask);
  }

  deleteTask(index: number) {
    this.tasks.splice(index, 1);
  }

  toggleTaskCompletion(index: number) {
    this.tasks[index].completed = !this.tasks[index].completed;
  }  
}
