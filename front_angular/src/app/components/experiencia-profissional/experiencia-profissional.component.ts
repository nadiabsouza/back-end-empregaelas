import { Component, OnInit } from '@angular/core';
import { faStairs } from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-experiencia-profissional',
  templateUrl: './experiencia-profissional.component.html',
  styleUrls: ['./experiencia-profissional.component.css']
})
export class ExperienciaProfissionalComponent implements OnInit {

  expIcon = faStairs;

  constructor() { }

  ngOnInit(): void {
  }

}
