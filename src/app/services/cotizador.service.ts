import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Pais} from '../models/Pais';
import { Observable, BehaviorSubject } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class CotizadorService {
  myAppUrl = 'http://localhost:8080/';
  myApiUrl = 'api/cotizador/pais/';
  list: Pais[];
  constructor(private http: HttpClient) { }

  obtenerRestaurantes(){
    this.http.get(this.myAppUrl + this.myApiUrl).toPromise()
                  .then(data =>{
                    this.list = data as Pais[]; 
                  });
  }
}
