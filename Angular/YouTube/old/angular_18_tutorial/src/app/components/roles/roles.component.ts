import { HttpClient } from '@angular/common/http';
import { Component, Inject, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { IRole } from '../../model/interface/role';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-roles',
  standalone: true,
  imports: [FormsModule, CommonModule],
  templateUrl: './roles.component.html',
  styleUrl: './roles.component.css'
})
export class RolesComponent implements OnInit{

  
  // firstName: string = "Prem";
  // angularVersion = '19'; // not recommended
  // booleanTrue: boolean = true;
  // currentDate: Date = new Date();

  // inputType: string = "button";
  // selectedState: string = "DC";

  // showWelcomeAlert () {
  //   alert("Welcome to Angular 19 Tutorial")

  // }

  // showMessage (message: string) {
  //   alert(message)
  // }

  
  //http = Inject(HttpClient)
  constructor(private http: HttpClient) {}
  roleList: IRole [] = [];

  ngOnInit(): void {
    this.getAllRoles()
  }

  getAllRoles () {
    this.http.get("http://localhost:3000/GetAllRoles")
    .subscribe(
      (res:any) => {
      this.roleList = res.data;
      }
    );
  }
}
