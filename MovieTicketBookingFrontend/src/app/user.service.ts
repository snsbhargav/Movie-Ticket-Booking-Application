import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';
import { User } from './User';
// import { User } from './User'
@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private httpClient:HttpClient) { }

  url:String = "http://localhost:8080/user";

  regsterUser(user:User):Observable<User>{
    return this.httpClient.post<User>(`${this.url}`,user);
  }

  getUser(id:number):Observable<User>{
    return this.httpClient.get<User>(`${this.url}/${id}`);
  }
}
