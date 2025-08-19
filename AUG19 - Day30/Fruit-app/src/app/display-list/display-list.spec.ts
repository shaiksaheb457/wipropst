import { ComponentFixture, TestBed } from '@angular/core/testing';
import { DisplayList } from './display-list';   // 👈 fix here

describe('DisplayListComponent', () => {
  let component: DisplayList;
  let fixture: ComponentFixture<DisplayList>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [DisplayList]   // 👈 use component here too
    })
    .compileComponents();

    fixture = TestBed.createComponent(DisplayList);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
