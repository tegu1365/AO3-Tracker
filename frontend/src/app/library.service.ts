import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import { Library } from "./library";

@Injectable({
  providedIn: 'root'
})
export class LibraryService {

  constructor(private http: HttpClient) {}

  public GetLibrary(): Observable<Library> {
    return this.http.get<Library>('/api/library');
  }
  public AddFanficToLibrary(fanfic: any): Observable<Library> {
    return this.http.post('/api/library', fanfic);
  }

  UpdateLibraryData
}
