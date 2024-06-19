import {Component, inject, model} from '@angular/core';
import {
  MAT_DIALOG_DATA,
  MatDialogActions,
  MatDialogClose,
  MatDialogContent,
  MatDialogRef, MatDialogTitle
} from "@angular/material/dialog";
import {MatFormField, MatFormFieldModule, MatLabel} from "@angular/material/form-field";
import {MatButton, MatButtonModule} from "@angular/material/button";
import {FormsModule} from "@angular/forms";
import {MatInputModule} from "@angular/material/input";
import {
  MatDatepicker,
  MatDatepickerActions,
  MatDatepickerInput, MatDatepickerModule,
  MatDatepickerToggle
} from "@angular/material/datepicker";
import {MatOption, MatSelect} from "@angular/material/select";
import {MatIcon} from "@angular/material/icon";
import {MatNativeDateModule} from "@angular/material/core";

interface Tag {
  value: string;
  viewValue: string;
}
export interface DialogData {//change to fanfic
  title:string;
  result: string;
}


@Component({
  selector: 'app-edit-fanfic',
  standalone: true,
  imports: [
    MatFormFieldModule,
    MatInputModule,
    FormsModule,
    MatButtonModule,
    MatDialogTitle,
    MatDialogContent,
    MatDialogActions,
    MatDialogClose,
    MatDatepickerToggle,
    MatDatepickerActions,
    MatDatepickerInput,
    MatDatepicker,
    MatSelect,
    MatOption,
    MatIcon,
    MatDatepickerModule,
    MatNativeDateModule,
  ],
  templateUrl: './edit-fanfic.component.html',
  styleUrl: './edit-fanfic.component.css'
})


export class EditFanficComponent {
  readonly dialogRef = inject(MatDialogRef<EditFanficComponent>);
  readonly data = inject<DialogData>(MAT_DIALOG_DATA);
  readonly result = model(this.data.result);
  selectedValue: any;
  value = 0;
  libraryTags: Tag[]=[
    {value: 'PlanToRead', viewValue: 'Plan to Read'},
    {value: 'Reading', viewValue: 'Reading'},
    {value: 'Read', viewValue: 'Read'},
    {value: 'OnHold', viewValue: 'On Hold'},
    {value: 'Dropped', viewValue: 'Dropped'},
  ];
  onNoClick(): void {
    this.dialogRef.close();
  }
}
