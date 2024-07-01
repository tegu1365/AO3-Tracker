import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchFanficComponent } from './search-fanfic.component';

describe('SearchFanficComponent', () => {
  let component: SearchFanficComponent;
  let fixture: ComponentFixture<SearchFanficComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SearchFanficComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SearchFanficComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
