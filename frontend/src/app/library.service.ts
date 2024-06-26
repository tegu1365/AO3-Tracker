import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import { Library } from "./library";

@Injectable({
  providedIn: 'root'
})
export class LibraryService {

  constructor(private http: HttpClient) {}

  public GetLibrary(userId:number): Observable<Library[]> {
    return this.http.get<Library[]>('/api/library?userId='+userId);
  }
  public FanficToLibrary(fanfic: any): Observable<any> {
    return this.http.put('/api/library/add', fanfic);
  }

  public ExistingLibrary(userId: number, fanficId: number | undefined):Observable<Library>{
    return this.http.post<Library>('/api/library/exist', {userId,fanficId});
  }
 // UpdateLibraryData
}
