import { Component, inject, OnInit } from '@angular/core';
import { MasterService } from '../../services/master.service';
import { APIResponseModel, IDesignation } from '../../model/interface/role';

@Component({
  selector: 'app-designation',
  standalone: true,
  imports: [],
  templateUrl: './designation.component.html',
  styleUrl: './designation.component.css'
})
export class DesignationComponent implements OnInit{

  constructor(private masterService: MasterService) {}
  //masterService = inject(MasterService)

  designationList: IDesignation [] = [];
  isLoader: boolean = true;

  ngOnInit(): void {
    this.masterService.getDesignation()
    .subscribe(
      (result: APIResponseModel) => {
        this.designationList = result.data;
        this.isLoader = false;
      },
      error => {
        alert ("API error / Network Down")
        this.isLoader = false;
      }
    )
  }
}
