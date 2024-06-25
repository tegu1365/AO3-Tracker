import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import { Users } from "./user";

@Injectable({
  providedIn: 'root'
})
export class UsersService {

  constructor(private http: HttpClient) { }

  public GetUser(id: number): Observable<User> {
    return this.http.get<User>('/api/user', id);
  }

  public Login(email: string, password: string): Observable<User> {
    return this.http.get<User>('/api/user', { email, password });
  }

  public Registration(email: string, username: string, password: string,): Observable<Library> {
    return this.http.post('/api/user', { email, username, password });
  }
}
