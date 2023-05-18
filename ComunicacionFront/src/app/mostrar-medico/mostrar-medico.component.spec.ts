import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MostrarMedicoComponent } from './mostrar-medico.component';

describe('MostrarMedicoComponent', () => {
  let component: MostrarMedicoComponent;
  let fixture: ComponentFixture<MostrarMedicoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MostrarMedicoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MostrarMedicoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
