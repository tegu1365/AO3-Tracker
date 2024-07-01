import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {FanficComponent} from "./fanfic/fanfic.component";
import {CollectionInfoComponent} from "./collection-info/collection-info.component";
import {SearchFanficComponent} from "./search-fanfic/search-fanfic.component";
import {MenuComponent} from "./menu/menu.component";
@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, FanficComponent, CollectionInfoComponent, SearchFanficComponent, MenuComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'frontend';
}
