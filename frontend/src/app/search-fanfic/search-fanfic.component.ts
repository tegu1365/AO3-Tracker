import { Component } from '@angular/core';
import {MatFormField, MatFormFieldModule} from "@angular/material/form-field";
import {MatInput, MatInputModule} from "@angular/material/input";
import {MatButton} from "@angular/material/button";
import {FormsModule} from "@angular/forms";
import {FanficComponent} from "../fanfic/fanfic.component";
import {Fanfic} from "../fanfic";
import {FanficService} from "../fanfic.service";
import {EMPTY} from "rxjs";

@Component({
  selector: 'app-search-fanfic',
  standalone: true,
  imports: [
    FormsModule, MatFormFieldModule, MatInputModule,
    MatButton, FanficComponent
  ],
  templateUrl: './search-fanfic.component.html',
  styleUrl: './search-fanfic.component.css'
})
export class SearchFanficComponent {
  isSearch=false;
  url='';
  fanfic: Fanfic = {} as Fanfic;
  haveFanfic=false;

  constructor(private fanficService:FanficService) {

  }

  Search(link: string){
    this.isSearch=true;
    this.url=link;
    console.log(this.url);
    this.fanficService.GetFanfic(this.url).subscribe(
      value => {
        //console.log(value);
        this.fanfic = value;
        this.haveFanfic=true;
        //console.log(this.fanfic);
      }
    )
  }
}
