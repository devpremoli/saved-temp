import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { APIResponseModel } from '../model/interface/role';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MasterService {

  constructor(private http: HttpClient) { }

  getDesignation (): Observable<APIResponseModel> {
    return this.http.get<APIResponseModel>("http://localhost:3000/GetAllDesignation")
  }
}
