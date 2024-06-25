import {Component, signal} from '@angular/core';
import {RouterLink, Routes} from "@angular/router";
import {LibraryComponent} from "../library/library.component";
import {CollectionInfoComponent} from "../collection-info/collection-info.component";
import {HomeComponent} from "../home/home.component";
import {MatAnchor, MatButton} from "@angular/material/button";
import {MatToolbar} from "@angular/material/toolbar";


@Component({
  selector: 'app-menu',
  standalone: true,
  imports: [
    MatButton,
    MatToolbar,
    MatAnchor,
    RouterLink
  ],
  templateUrl: './menu.component.html',
  styleUrl: './menu.component.css'
})
export class MenuComponent {

  Logout(){
    localStorage.removeItem("userId");
  }

  protected readonly localStorage = localStorage;
}
