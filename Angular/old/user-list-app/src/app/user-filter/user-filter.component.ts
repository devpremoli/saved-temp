import { Component, EventEmitter, Output } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-user-filter',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './user-filter.component.html',
  styleUrl: './user-filter.component.css'
})
export class UserFilterComponent {

  @Output() filterChanged = new EventEmitter<string>();  // Output to emit the filter text

  // When the user types, emit the value to the parent component
  onFilterChange(event: Event) {
    const inputElement = event.target as HTMLInputElement;  // Safely cast to HTMLInputElement
    this.filterChanged.emit(inputElement.value);  // Emit value to parent
  }

}
