import { Component } from '@angular/core';
import { Medico } from '../modelo/Medico';
import { MedicoService } from '../servicio/medico.service';

@Component({
  selector: 'app-mostrar-medico',
  templateUrl: './mostrar-medico.component.html',
  styleUrls: ['./mostrar-medico.component.css']
})
export class MostrarMedicoComponent {


  medico:Medico[]=[];

  constructor(private medicoServi: MedicoService){}

  ngOnInit():void{
    this.mostrarMedico();
  }
  mostrarMedico():void{
    this.medicoServi.listar().subscribe(info=>this.medico=info)
  }

}
