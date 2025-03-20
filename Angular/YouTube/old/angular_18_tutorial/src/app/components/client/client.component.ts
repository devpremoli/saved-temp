import { Component, OnInit } from '@angular/core';
import { Client } from '../../model/class/Client';
import { FormsModule } from '@angular/forms';
import { ClientService } from '../../services/client.service';
import { APIResponseModel } from '../../model/interface/role';

@Component({
  selector: 'app-client',
  imports: [FormsModule],
  templateUrl: './client.component.html',
  styleUrl: './client.component.css'
})
export class ClientComponent implements OnInit{

  ClientObj: Client = new Client();
  clientList: Client[] = [];

  constructor(private clientService: ClientService) {}

  ngOnInit(): void {
    this.loadClient()
    
  }

  loadClient () {
    this.clientService.getAllClients()
    .subscribe(
      (res: APIResponseModel) => {
        this.clientList = res.data;
      }
    )
  }

  onSaveClient() {
    debugger;
    this.clientService.addUpdate(this.ClientObj)
    .subscribe(
      (res: APIResponseModel) => {
        if (res.result) {
          alert("Client Created Success");
          this.loadClient();
        } else {
          alert(res.message);
        }
      }
    )
  }


}
