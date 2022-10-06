import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { movie } from './movie';
import { screen } from './screen';

@Injectable({
  providedIn: 'root'
})
export class MovieService {

  constructor(private httpClient:HttpClient) { }

  url:String = "http://localhost:8080";

  allMovies():Observable<movie[]>{
    return this.httpClient.get<movie[]>(`${this.url}/${"allmovies"}`);
  }
  PvrMovies():Observable<movie[]>{
    return this.httpClient.get<movie[]>(`${this.url}/${"movie"}/${"PVR"}`);
  }
  InoxMovies():Observable<movie[]>{
    return this.httpClient.get<movie[]>(`${this.url}/${"movie"}/${"INOX"}`);
  }

  getMovie(id:number):Observable<movie>{
    return this.httpClient.get<movie>(`${this.url}/${"movie"}/${id}`);
  }
  getScreen(id: number):Observable<screen>{
    return this.httpClient.get<screen>(`${this.url}/${"moviescreen"}/${id}`);
  }
  getScreenId(movieid:number):Observable<Number>{
    return this.httpClient.get<Number>(`${this.url}/${"movscr"}/${movieid}`);
  }
}
