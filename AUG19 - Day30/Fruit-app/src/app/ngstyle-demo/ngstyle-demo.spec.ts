import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NgstyleDemo } from './ngstyle-demo';

describe('NgstyleDemo', () => {
  let component: NgstyleDemo;
  let fixture: ComponentFixture<NgstyleDemo>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [NgstyleDemo]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NgstyleDemo);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
