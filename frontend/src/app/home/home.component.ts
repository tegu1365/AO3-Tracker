import { Component } from '@angular/core';
import {SearchFanficComponent} from "../search-fanfic/search-fanfic.component";

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [
    SearchFanficComponent
  ],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {

}
