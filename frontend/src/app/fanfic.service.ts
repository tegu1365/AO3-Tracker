import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { Fanfic } from "./fanfic";
import { CustomTag  } from "./customtag";

@Injectable({
  providedIn: 'root'
})
export class FanficService {

  constructor(private http: HttpClient) {  }

  public GetFanfic(): Observable<Fanfic> {
    return this.http.get<Fanfic>('/api/fanfic');
  }

  public GetFanficById(id: number): Observable<any> {
    return this.http.get<Fanfic>('/api/fanfic/id='+id);
  }

 // GetAllCollectionOfFic
 // AddCustumTag
}

