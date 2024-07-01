import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FanficComponent } from './fanfic.component';

describe('FanficComponent', () => {
  let component: FanficComponent;
  let fixture: ComponentFixture<FanficComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FanficComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FanficComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
