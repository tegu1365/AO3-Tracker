import { Injectable } from '@angular/core';
import { Collection } from "./collection";
import { User } from "./users";
import { Fanfic } from "./fanfic";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class CollectionService {

  constructor(private http: HttpClient) {}
/*
  public CreateCollection(ownerId: User, name: string, description: string, fanfics: Fanfic[]): Observable<Collection> {
    return this.http.post('/api/collection', {description, fanfics, name, ownerId});
  }

  public GetCollection(name: string, id: number): Observable<Collection> {
    return this.http.get<Collection>('/api/collection', { name, id });
  }

  public AddFanficToCollection(name: string, id: number, fanfic: Fanfic): Observable<Collection> {
    return this.http.post('/api/collection', { name, id, fanfic });
  }
*/
  //get all collections of user
}
