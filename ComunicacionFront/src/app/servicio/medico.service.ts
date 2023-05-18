import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Medico } from '../modelo/Medico';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class MedicoService {

  private url : string=`http://localhost:8080/medicos`

  constructor(private http: HttpClient) { }

  listar():Observable<Medico[]>{
    return this.http.get<Medico[]>(this.url)
  }
  
}
