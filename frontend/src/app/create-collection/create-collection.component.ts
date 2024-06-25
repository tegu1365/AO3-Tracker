import { Component } from '@angular/core';
import {MatFormField} from "@angular/material/form-field";
import {MatIcon} from "@angular/material/icon";
import {FormsModule} from "@angular/forms";
import {MatInput} from "@angular/material/input";

@Component({
  selector: 'app-create-collection',
  standalone: true,
  imports: [
    MatFormField,
    MatIcon,
    FormsModule,
    MatInput
  ],
  templateUrl: './create-collection.component.html',
  styleUrl: './create-collection.component.css'
})
export class CreateCollectionComponent {
  name='Name';
}
