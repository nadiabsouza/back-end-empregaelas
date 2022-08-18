import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CardFormacaoComponent } from './card-formacao.component';

describe('CardFormacaoComponent', () => {
  let component: CardFormacaoComponent;
  let fixture: ComponentFixture<CardFormacaoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CardFormacaoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CardFormacaoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
