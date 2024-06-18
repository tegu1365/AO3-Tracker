import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Fanfic} from "./fanfic";

@Injectable({
  providedIn: 'root'
})
export class FanficService {

  constructor(private http: HttpClient) {
    GetFanfic
    GetFanficById
    GetAllCollectionOfFic
    AddCustumTag
    }
}
