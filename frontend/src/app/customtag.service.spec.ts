import { TestBed } from '@angular/core/testing';

import { CustomtagService } from './customtag.service';

describe('CustomtagService', () => {
  let service: CustomtagService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CustomtagService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
