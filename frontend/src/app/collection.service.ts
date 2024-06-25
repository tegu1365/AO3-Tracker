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
  public CreateCollection(ownerId: User, name: string, description: string, fanfics: Fanfic[]): Observable<Collection> {
    return this.http.post('/api/collection/add', {description, fanfics, name, ownerId});
  }

  public GetCollection(id: number): Observable<Collection> {
    return this.http.get<Collection>('/api/collection/'+id });
  }

  public AddFanficToCollection(fanficId: number, collectionId: number): Observable<Collection> {
    return this.http.post('/api/fanfic/collection/add', { fanficId, collectionId });
  }

  //get all collections of user
}
