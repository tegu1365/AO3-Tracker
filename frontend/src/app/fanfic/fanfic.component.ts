import {ChangeDetectionStrategy, Component, inject, signal} from '@angular/core';
import {MatCardModule} from "@angular/material/card";
import {MatDividerModule} from "@angular/material/divider";
import {MatFormField} from "@angular/material/form-field";
import {MatButton} from "@angular/material/button";
import {MatButtonModule} from '@angular/material/button';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import {provideNativeDateAdapter} from '@angular/material/core';
import {MatChip, MatChipSet} from "@angular/material/chips";
import {MatDialog} from "@angular/material/dialog";
import {EditFanficComponent} from "../edit-fanfic/edit-fanfic.component";


@Component({
  selector: 'app-fanfic',
  standalone: true,
  providers: [provideNativeDateAdapter()],
  imports: [MatCardModule, MatDividerModule, MatFormField, MatButton, MatFormFieldModule, MatInputModule, MatDatepickerModule, MatButtonModule, MatChipSet, MatChip],
  templateUrl: './fanfic.component.html',
  styleUrl: './fanfic.component.css',
  changeDetection: ChangeDetectionStrategy.OnPush,
})
export class FanficComponent {
  isShow=false;
  readonly dialog = inject(MatDialog);
  result=signal('')
  toggleDisplay() {
    this.isShow = !this.isShow;
  }
  openDialog(){
    const dialogRef = this.dialog.open(EditFanficComponent, {
      data: {title: "Fanfic Title",result:this.result},
    });

    dialogRef.afterClosed().subscribe(result => {
      console.log('The dialog was closed');
      if (result !== undefined) {
        this.result.set(result);
      }
    });
  }
}
