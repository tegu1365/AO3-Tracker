import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CustomtagService {
  constructor(private http: HttpClient) {  }

}
