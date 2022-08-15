import { Component, OnInit } from '@angular/core';
import { faGraduationCap } from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-dados-academicos',
  templateUrl: './dados-academicos.component.html',
  styleUrls: ['./dados-academicos.component.css']
})
export class DadosAcademicosComponent implements OnInit {

  escolaridadeIcon = faGraduationCap;

  constructor() { }

  ngOnInit(): void {
  }

}
