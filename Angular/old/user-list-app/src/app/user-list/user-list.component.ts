import { Component, Input } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CustomUppercasePipe } from '../custom-uppercase.pipe';  // Import the custom pipe

@Component({
  selector: 'app-user-list',
  standalone: true,
  imports: [CommonModule, CustomUppercasePipe],
  templateUrl: './user-list.component.html',
  styleUrl: './user-list.component.css'
})
export class UserListComponent {

  @Input() users: { name: string }[] = [];
  @Input() filterText: string = '';

  getFilteredUsers() {
    return this.users.filter(user => user.name.toLowerCase().includes(this.filterText.toLowerCase()));
  }  

}
