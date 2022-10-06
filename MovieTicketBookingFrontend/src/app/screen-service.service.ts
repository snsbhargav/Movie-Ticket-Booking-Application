import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { screen } from './screen';

@Injectable({
  providedIn: 'root'
})
export class ScreenService {

  constructor(private httpClient:HttpClient) { }

  url = "http://localhost:8080";
  getScreen(id:Number):Observable<screen>{
    return this.httpClient.get<screen>(`${this.url}/${"screen"}/${id}`);
  }
}
