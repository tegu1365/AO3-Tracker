import {Component, inject, Input, OnInit, signal} from '@angular/core';
import {
  MAT_DIALOG_DATA,
  MatDialogActions,
  MatDialogClose,
  MatDialogContent,
  MatDialogRef,
  MatDialogTitle
} from "@angular/material/dialog";
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatButtonModule} from "@angular/material/button";
import {FormControl, FormsModule, ReactiveFormsModule} from "@angular/forms";
import {MatInputModule} from "@angular/material/input";
import {
  MatDatepicker,
  MatDatepickerActions,
  MatDatepickerInput,
  MatDatepickerModule,
  MatDatepickerToggle
} from "@angular/material/datepicker";
import {MatOption, MatSelect} from "@angular/material/select";
import {MatIcon} from "@angular/material/icon";
import {MatNativeDateModule} from "@angular/material/core";
import {Collection} from "../collection";
import {CollectionService} from "../collection.service";
import {LibraryService} from "../library.service";
import {Library} from "../library";
import {UsersService} from "../users.service";
import {Fanfic} from "../fanfic";
import {FanficService} from "../fanfic.service";
import {LibraryTag} from "../library-tag";

interface Tag {
  value: LibraryTag;
  viewValue: string;
}

export interface DialogData {//change to fanfic
  title: string;
  fanficId: number;
  library: Library;
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
    ReactiveFormsModule,
  ],
  templateUrl: './edit-fanfic.component.html',
  styleUrl: './edit-fanfic.component.css'
})


export class EditFanficComponent implements OnInit{
  //readonly dialogRef = inject(MatDialogRef<EditFanficComponent>);
  //readonly data = inject<DialogData>(MAT_DIALOG_DATA);
  @Input()
  data: DialogData={} as DialogData;
  library: Library = {} as Library;
  fanfic: Fanfic = {} as Fanfic;
  value = 0;
  libraryTags: Tag[] = [
    {value: LibraryTag.plan, viewValue: 'Plan to Read'},
    {value: LibraryTag.reading, viewValue: 'Reading'},
    {value: LibraryTag.read, viewValue: 'Read'},
    {value: LibraryTag.onHold, viewValue: 'On Hold'},
    {value: LibraryTag.drop, viewValue: 'Dropped'},
  ];
  collections = new FormControl('');
  userCollection: Collection[] = [];
  userId: number = 0;

  constructor(private cService: CollectionService,
              private libraryService: LibraryService,
              private userService: UsersService,
              private fanficService: FanficService) {
  }
  ngOnInit(){
    if(this.data.library!=null){
      this.library=this.data.library;
    }else {
      this.userId = Number(localStorage.getItem("userId"));
     // console.log(this.data);
     // console.log(this.userId);
      this.cService.getUserCollections(this.userId).subscribe(
        value => {
          this.userCollection = value;
        }
      );
      this.userService.GetUser(this.userId).subscribe(
        value1 => {
          //console.log("This User:");

          console.log(value1);
          this.library.userId = value1;
        }
      );
      this.fanficService.GetFanficById(this.data.fanficId).subscribe(
        value1 => {
          this.fanfic = value1;
          this.library.fanficId = value1;
        }
      );
    }
      console.log("This after init Lib:");
      console.log(this.library);
  }
  Save() {
    console.log("Lib before send:");
    console.log(this.library);
    this.libraryService.FanficToLibrary(this.library).subscribe(
      value1 => {
        console.log("Return Lib:");

        console.log(value1);
      }
    );
  }

  Close(){

  }
 /* onNoClick(): void {
    this.dialogRef.close();
  }*/
}
