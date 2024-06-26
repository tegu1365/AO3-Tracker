import { Injectable } from '@angular/core';
import { Collection } from "./collection";
import { User } from "./users";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class CollectionService {

  constructor(private http: HttpClient) {}
  public CreateCollection(ownerId: number, name: string, description: string): Observable<Collection> {
    return this.http.post('/api/collection/create', {description, name, ownerId});
  }

  public GetCollection(id: number): Observable<Collection> {
    return this.http.get<Collection>('/api/collection/'+id );
  }

  public AddFanficToCollection(fanficId: number, collectionId: number): Observable<Collection> {
    return this.http.post('/api/collection/add', { fanficId, collectionId });
  }

  //get all collections of user
  public  getUserCollections(userId:any):Observable<Collection[]>{
    return this.http.get<Collection[]>('/api/collection/user='+userId);
  }
}
