import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { IUser } from '../model/interface/IUser';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment.development';
import { HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  constructor(private http: HttpClient) { }

  registerUser(user: IUser): Observable<IUser> {
    const headers = new HttpHeaders().set('Authorization', `Bearer ${localStorage.getItem('token')}`);
    return this.http.post<IUser>(`${environment.API_URL}/register`, user);
  }
}
