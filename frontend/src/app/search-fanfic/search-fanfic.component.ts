import { Component } from '@angular/core';
import {MatFormField, MatFormFieldModule} from "@angular/material/form-field";
import {MatInput, MatInputModule} from "@angular/material/input";
import {MatButton} from "@angular/material/button";
import {FormsModule} from "@angular/forms";
import {FanficComponent} from "../fanfic/fanfic.component";

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

}
