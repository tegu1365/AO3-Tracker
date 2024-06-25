import { Routes } from '@angular/router';
import {HomeComponent} from "./home/home.component";
import {LibraryComponent} from "./library/library.component";
import {CollectionsComponent} from "./collections/collections.component";
import {LoginComponent} from "./login/login.component";


export const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  { path: 'home', component: HomeComponent },
  { path: 'library', component: LibraryComponent },
  { path: 'collections', component: CollectionsComponent },
  { path: 'login', component: LoginComponent}
];
