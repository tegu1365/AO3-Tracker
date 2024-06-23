import { Component } from '@angular/core';
import {MatDivider} from "@angular/material/divider";
import {FanficComponent} from "../fanfic/fanfic.component";

@Component({
  selector: 'app-collection-info',
  standalone: true,
  imports: [
    MatDivider,
    FanficComponent
  ],
  templateUrl: './collection-info.component.html',
  styleUrl: './collection-info.component.css'
})
export class CollectionInfoComponent {

}
