import { ComponentFixture, TestBed } from '@angular/core/testing';
import { FruitComponent } from './fruit';

describe('FruitComponent', () => {
  let component: FruitComponent;
  let fixture: ComponentFixture<FruitComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [FruitComponent]   // ✅ declare component
    })
    .compileComponents();

    fixture = TestBed.createComponent(FruitComponent);  // ✅ create instance
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
