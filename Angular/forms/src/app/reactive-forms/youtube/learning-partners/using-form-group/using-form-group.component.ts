import { CommonModule } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-using-form-group',
  imports: [ReactiveFormsModule, CommonModule],
  templateUrl: './using-form-group.component.html',
  styleUrl: './using-form-group.component.css'
})
export class UsingFormGroupComponent {

  constructor(private http: HttpClient) {
    this.getAllUser();
  }

  usersArray: any[] = [];

  userForm: FormGroup = new FormGroup ({
    id: new FormControl('0'),
    name: new FormControl('', [Validators.required, Validators.minLength(3)]),
    username: new FormControl(''),
    email: new FormControl('')
  })

  getAllUser() {
    this.http.get('https://jsonplaceholder.typicode.com/users')
    .subscribe(
      (res:any) => {
        this.usersArray = res;
      }
    )
  }

  onSaveUser() {
    debugger;
    const obj = this.userForm.value;
    this.http.post('https://jsonplaceholder.typicode.com/users', obj)
    .subscribe(
      (res:any) => {
        alert('User Created')
      }
    )
  }

  onEdit(id: number) {
    this.http.get('https://jsonplaceholder.typicode.com/users/' + id)
    .subscribe(
      (res:any) => {
        this.userForm = new FormGroup ({
          id: new FormControl(res.id),
          name: new FormControl(res.name),
          username: new FormControl(res.username),
          email: new FormControl(res.email)
        })
      }
    )
  }
}
