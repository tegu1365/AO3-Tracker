import { Injectable } from '@angular/core';
import { Collection } from "./collection";
import { Users } from "./user";
import { Fanfic } from "./fanfic";

@Injectable({
  providedIn: 'root'
})
export class CollectionService {

  constructor(private http: HttpClient) {}

  public CreateCollection(ownerId: Users, name: string, description: string, fanfics: Fanfic[]): Observable<Collection> {
    return this.http.post('/api/collection', { ownerId, name, description, fanfics });
  }

  public GetCollection(name: string, id: number): Observable<Collection> {
    return this.http.get<Collection>('/api/collection', { name, id });
  }

  public AddFanficToCollection(name: string, id: number, fanfic: Fanfic): Observable<Collection> {
    return this.http.post('/api/collection', { name, id, fanfic });
  }

}
