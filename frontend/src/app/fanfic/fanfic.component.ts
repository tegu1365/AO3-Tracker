import {ChangeDetectionStrategy, Component, inject, Input, signal} from '@angular/core';
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
import {EditFanficComponent} from "../edit-fanfic/edit-fanfic.component";
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
  imports: [MatCardModule, MatDividerModule, MatFormField, MatButton, MatFormFieldModule, MatInputModule, MatDatepickerModule, MatButtonModule, MatChipSet, MatChip, MatSelect, MatOption, ReactiveFormsModule],
  templateUrl: './fanfic.component.html',
  styleUrl: './fanfic.component.css',
  changeDetection: ChangeDetectionStrategy.OnPush,
})
export class FanficComponent {
  isShow=false;

  readonly dialog = inject(MatDialog);
  @Input()
  fanfic: Fanfic = {} as Fanfic;
  library: Library= {} as Library
  inLibrary:boolean= false;

  constructor(private http: HttpClient, private libraryService: LibraryService) {
      let userId =Number(localStorage.getItem("userId"))
      libraryService.ExistingLibrary( userId, this.fanfic.id).subscribe(
        value => this.library = value
      )
    if(this.library.id!=null){
      this.inLibrary=true;
    }
  }

  toggleDisplay() {
    this.isShow = !this.isShow;
  }
  openDialog(){
    const dialogRef = this.dialog.open(EditFanficComponent, {
      data: {title: this.fanfic.title, fanficId:this.fanfic.id , library: this.library},
    });

    dialogRef.afterClosed().subscribe(result => {
      console.log('The dialog was closed');
    });
  }

}
