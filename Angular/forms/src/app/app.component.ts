import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { UsingFormGroupComponent } from "./reactive-forms/youtube/learning-partners/using-form-group/using-form-group.component";
import { provideHttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, UsingFormGroupComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'forms';
}
