import { Component } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  imports: [],
  templateUrl: './data-binding.component.html',
  styleUrl: './data-binding.component.css'
})
export class DataBindingComponent {

  // creating variables
  courseName: string = "Angular 18";
  inputType: string = "checkbox";

  constructor() {
    
  }

}
