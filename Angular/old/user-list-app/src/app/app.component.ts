import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

import { CommonModule } from '@angular/common';  // Importing CommonModule for common directives
import { FormsModule } from '@angular/forms';    // Importing FormsModule for two-way data binding
import { UserListComponent } from './user-list/user-list.component';
import { UserFilterComponent } from './user-filter/user-filter.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, CommonModule, FormsModule, UserListComponent, UserFilterComponent],  // Direct imports,
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'user-list-app';

  // Mock user data
  users = [
    { name: 'John Doe' },
    { name: 'Jane Smith' },
    { name: 'Alice Johnson' },
    { name: 'Bob Brown' }
  ];

  filterText = '';  // Stores the search filter input

  // This method is called when UserFilterComponent emits a value
  updateFilter(value: string) {
    this.filterText = value;
  }
  
}
