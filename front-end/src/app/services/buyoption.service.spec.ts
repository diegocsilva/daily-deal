import { TestBed } from '@angular/core/testing';

import { BuyoptionService } from './buyoption.service';

describe('BuyoptionService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: BuyoptionService = TestBed.get(BuyoptionService);
    expect(service).toBeTruthy();
  });
});
