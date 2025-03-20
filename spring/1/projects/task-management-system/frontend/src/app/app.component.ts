import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { TaskFormComponent } from "./components/task-form/task-form.component";
import { TaskListComponent } from "./components/task-list/task-list.component";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, TaskFormComponent, TaskListComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'task_management_system_angular';
}
