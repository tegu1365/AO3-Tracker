import { Component } from '@angular/core';
import {FanficComponent} from "../fanfic/fanfic.component";
import {MatDivider} from "@angular/material/divider";
import { UsersService } from '../users.service';
import { User } from '../users';
import { Library } from '../library';
import { LibraryService } from '../library.service';

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
  user :User = {} as User;
  libraries : Library[] =  [];
  constructor(private usersService: UsersService, private libraryService: LibraryService) {
    let userId= Number(localStorage.getItem("userId"));
    this.usersService.GetUser(userId).subscribe(
      value => {
        console.log(value);
        this.user = value;
      }
    );
    this.libraryService.GetLibrary(userId).subscribe(
      value => {
        console.log(value);
        this.libraries = value;}
    );
  }

}
