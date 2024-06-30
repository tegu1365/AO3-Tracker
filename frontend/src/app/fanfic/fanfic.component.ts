import {ChangeDetectionStrategy, Component, inject, Input, OnInit, signal} from '@angular/core';
import {MatCardModule} from "@angular/material/card";
import {MatDividerModule} from "@angular/material/divider";
import {MatFormField} from "@angular/material/form-field";
import {MatButton} from "@angular/material/button";
import {MatButtonModule} from '@angular/material/button';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatOption, provideNativeDateAdapter} from '@angular/material/core';
import {MatChip, MatChipSet} from "@angular/material/chips";
import {MatDialog} from "@angular/material/dialog";
import {DialogData, EditFanficComponent} from "../edit-fanfic/edit-fanfic.component";
import {MatSelect} from "@angular/material/select";
import {FormControl, ReactiveFormsModule} from "@angular/forms";
import {Fanfic} from "../fanfic";
import {Library} from "../library";
import {LibraryService} from "../library.service";
import {HttpClient} from "@angular/common/http";
import {UsersService} from "../users.service";


@Component({
  selector: 'app-fanfic',
  standalone: true,
  providers: [provideNativeDateAdapter()],
  imports: [MatCardModule, MatDividerModule, MatFormField, MatButton, MatFormFieldModule, MatInputModule, MatDatepickerModule, MatButtonModule, MatChipSet, MatChip, MatSelect, MatOption, ReactiveFormsModule, EditFanficComponent],
  templateUrl: './fanfic.component.html',
  styleUrl: './fanfic.component.css',
  changeDetection: ChangeDetectionStrategy.OnPush,
})
export class FanficComponent implements OnInit{
  isShow=false;
  isLibrary=false;

  //readonly dialog = inject(MatDialog);
  @Input()
  fanfic: Fanfic = {} as Fanfic;
  library: Library= {} as Library
  inLibrary: boolean= false;
  data:DialogData={} as DialogData;

  constructor(private http: HttpClient, private libraryService: LibraryService) {
  }

  ngOnInit(){
    let userId =Number(localStorage.getItem("userId"));
    console.log(this.fanfic);
    this.libraryService.ExistingLibrary( userId, this.fanfic.id).subscribe(
      value => {
        //console.log("library fanfic:")
       // console.log(value);
        if(value!=null){
          this.inLibrary=true;
        }
        this.library = value;
      }
    );
  }
  toggleDisplay() {
    this.isShow = !this.isShow;
  }

  openLibrary(){
    console.log(this.fanfic);
    if (this.fanfic.title != null) {
      this.data.title = this.fanfic.title;
    }
    if (this.fanfic.id != null) {
      this.data.fanficId = this.fanfic.id;
    }
  //  console.log("send data lib:")
    //console.log(this.library)
    this.data.library=this.library;

    //console.log("fanficC");
    //console.log(this.data);
    this.isLibrary=true;
  }
 /* openDialog(){
    const dialogRef = this.dialog.open(EditFanficComponent, {
      data: {title: this.fanfic.title, fanficId:this.fanfic.id , library: this.library},
    });

    dialogRef.afterClosed().subscribe(result => {
      console.log('The dialog was closed');
    });
  }*/

}
