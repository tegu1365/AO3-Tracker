import { Component } from '@angular/core';
import {MatAnchor} from "@angular/material/button";
import {MatToolbar} from "@angular/material/toolbar";
import {RouterLink} from "@angular/router";
import {CollectionInfoComponent} from "../collection-info/collection-info.component";
import {Collection} from "../collection";
import {CollectionService} from "../collection.service";

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
  collections: Collection[] = [];
  cId : number = -1;
  constructor(private collectionService: CollectionService) {
    let userId=Number(localStorage.getItem("userId"));
    this.collectionService.getUserCollections(userId).subscribe(
      value => {
        console.log(value);
        this.collections=value;
      }
    )
  }
  onClick(id: number)
  {
    this.cId = id;
  }
}
