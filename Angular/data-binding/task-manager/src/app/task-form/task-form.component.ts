import { Component, Output, EventEmitter } from '@angular/core';

import { Task } from '../models/task.model';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-task-form',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './task-form.component.html',
  styleUrl: './task-form.component.css'
})
export class TaskFormComponent {
  newTaskTitle: string = '';

  @Output() addTask = new EventEmitter<Task>();

  onAddTask() {
    if (this.newTaskTitle.trim()) {
      this.addTask.emit({ title: this.newTaskTitle, completed: false });
      this.newTaskTitle = '';  // Reset the input field
    }
  }
}
