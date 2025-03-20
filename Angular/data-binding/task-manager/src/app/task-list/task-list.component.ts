import { Component, Input, Output, EventEmitter } from '@angular/core';

import { Task } from '../models/task.model';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-task-list',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './task-list.component.html',
  styleUrl: './task-list.component.css'
})
export class TaskListComponent {
  
  @Input() tasks: Task[] = [];
  @Output() deleteTask = new EventEmitter<number>();
  @Output() toggleCompletion = new EventEmitter<number>();

  onDeleteTask(index: number) {
    this.deleteTask.emit(index);
  }

  onToggleCompletion(index: number) {
    this.toggleCompletion.emit(index);
  }

}
