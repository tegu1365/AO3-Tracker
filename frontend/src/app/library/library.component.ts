import { Component } from '@angular/core';
import {FanficComponent} from "../fanfic/fanfic.component";
import {MatDivider} from "@angular/material/divider";

@Component({
  selector: 'app-library',
  standalone: true,
    imports: [
        FanficComponent,
        MatDivider
    ],
  templateUrl: './library.component.html',
  styleUrl: './library.component.css'
})
export class LibraryComponent {

}
