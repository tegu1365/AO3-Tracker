import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {FanficComponent} from "./fanfic/fanfic.component";
@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,FanficComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'frontend';
}
