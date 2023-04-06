import { TestBed } from '@angular/core/testing';

import { FacilityTypeService } from './facility-type.service';

describe('FacilityTpeService', () => {
  let service: FacilityTypeService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FacilityTypeService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
