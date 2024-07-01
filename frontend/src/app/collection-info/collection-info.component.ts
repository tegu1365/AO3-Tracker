import {Component, Input, numberAttribute} from '@angular/core';
import {MatDivider} from "@angular/material/divider";
import {FanficComponent} from "../fanfic/fanfic.component";
import { Collection } from '../collection';
import { CollectionService } from '../collection.service';

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
  @Input({transform: numberAttribute})
  cId : number | undefined = -1;
  collection :Collection = {} as Collection;
  constructor(private cService: CollectionService)
  {
    this.cService.GetCollection(this.cId).subscribe(
      value => { this.collection = value; }
    );
  }
}
