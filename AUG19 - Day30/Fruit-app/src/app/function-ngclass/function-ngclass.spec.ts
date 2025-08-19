import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FunctionNgclass } from './function-ngclass';

describe('FunctionNgclass', () => {
  let component: FunctionNgclass;
  let fixture: ComponentFixture<FunctionNgclass>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FunctionNgclass]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FunctionNgclass);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
