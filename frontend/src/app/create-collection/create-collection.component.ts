import { Component } from '@angular/core';
import {MatFormField, MatLabel} from "@angular/material/form-field";
import {MatIcon} from "@angular/material/icon";
import {FormsModule} from "@angular/forms";
import {MatInput} from "@angular/material/input";
import {MatButton} from "@angular/material/button";
import {CollectionService} from "../collection.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-create-collection',
  standalone: true,
  imports: [
    MatFormField,
    MatIcon,
    MatLabel,
    FormsModule,
    MatInput,
    MatButton
  ],
  templateUrl: './create-collection.component.html',
  styleUrl: './create-collection.component.css'
})
export class CreateCollectionComponent {
  constructor(private collectionService:CollectionService,private router: Router) {
  }

  Create(description: string, name: string) {
    let userId= Number(localStorage.getItem("userId"));
    this.collectionService.CreateCollection(userId, name ,description).subscribe(
      value =>{
        console.log(value);
        this.router.navigate(['/collections'])
      }
    )
  }
}
