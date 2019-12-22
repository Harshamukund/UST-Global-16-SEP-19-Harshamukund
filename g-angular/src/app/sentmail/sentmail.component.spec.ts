import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SentmailComponent } from './sentmail.component';

describe('SentmailComponent', () => {
  let component: SentmailComponent;
  let fixture: ComponentFixture<SentmailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SentmailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SentmailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
