import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DraftmailComponent } from './draftmail.component';

describe('DraftmailComponent', () => {
  let component: DraftmailComponent;
  let fixture: ComponentFixture<DraftmailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DraftmailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DraftmailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
