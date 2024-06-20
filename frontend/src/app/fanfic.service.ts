import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { Fanfic } from "./fanfic";

@Injectable({
  providedIn: 'root'
})
export class FanficService {

  constructor(private http: HttpClient) {  }

  public GetFanfic(): Observable<Fanfic> {
    return this.http.get<Fanfic>('/api/fanfic');
  }

  public GetFanficById(id: number): Observable<Fanfic> {
    return this.http.get<Fanfic>('/api/fanfic', id);
  }

  GetAllCollectionOfFic
  AddCustumTag
}

