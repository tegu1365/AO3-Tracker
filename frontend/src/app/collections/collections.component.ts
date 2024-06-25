import { Component } from '@angular/core';
import {MatAnchor} from "@angular/material/button";
import {MatToolbar} from "@angular/material/toolbar";
import {RouterLink} from "@angular/router";
import {CollectionInfoComponent} from "../collection-info/collection-info.component";

@Component({
  selector: 'app-collections',
  standalone: true,
  imports: [
    MatAnchor,
    MatToolbar,
    RouterLink,
    CollectionInfoComponent
  ],
  templateUrl: './collections.component.html',
  styleUrl: './collections.component.css'
})
export class CollectionsComponent {

}
