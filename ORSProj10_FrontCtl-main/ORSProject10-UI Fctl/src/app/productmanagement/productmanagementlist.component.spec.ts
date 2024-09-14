import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductmanagementlistComponent } from './productmanagementlist.component';

describe('ProductmanagementlistComponent', () => {
  let component: ProductmanagementlistComponent;
  let fixture: ComponentFixture<ProductmanagementlistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProductmanagementlistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProductmanagementlistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
