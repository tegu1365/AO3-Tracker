import { Injectable } from '@angular/core';
import {HttpClient, HttpEvent} from "@angular/common/http";
import {Observable} from "rxjs";
import { User } from "./users";

@Injectable({
  providedIn: 'root'
})
export class UsersService {

  constructor(private http: HttpClient) { }

  public GetUser(id: number): Observable<User> {
    return this.http.get<User>('/api/user/'+id);
  }

  public Login(loginInfo: any): Observable<User> {
    return this.http.post<User>('/api/user/login', loginInfo);
  }

  public Registration(registrationInfo: any): Observable<any> {
    return this.http.post('/api/user/create', registrationInfo);
  }
}
