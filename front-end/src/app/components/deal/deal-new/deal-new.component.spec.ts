import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DealNewComponent } from './deal-new.component';

describe('DealNewComponent', () => {
  let component: DealNewComponent;
  let fixture: ComponentFixture<DealNewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DealNewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DealNewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
