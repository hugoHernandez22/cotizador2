import { Component, OnInit } from '@angular/core';
import { CotizadorService } from 'src/app/services/cotizador.service';
@Component({
  selector: 'app-cotizar',
  templateUrl: './cotizar.component.html',
  styleUrls: ['./cotizar.component.scss']
})
export class CotizarComponent implements OnInit {

  constructor(public cotizadorService : CotizadorService) { }

  ngOnInit(): void {
    this.cotizadorService.obtenerRestaurantes();
  }

}
