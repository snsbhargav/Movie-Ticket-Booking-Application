import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { BookedSeats } from './BookedSeats';

@Injectable({
  providedIn: 'root'
})
export class BookingService {

  constructor(private httpClient:HttpClient) { }

  url = "http://localhost:8080";

  saveBooking(booking:BookedSeats):Observable<BookedSeats>{
    return this.httpClient.post<BookedSeats>(`${this.url}/${"booked"}`,booking);
  }

  getAllBookings():Observable<BookedSeats[]>{
    return this.httpClient.get<BookedSeats[]>(`${this.url}/${"all-bookings"}`);
  }

  updateBooking(booking:BookedSeats):Observable<BookedSeats>{
    return this.httpClient.put<BookedSeats>(`${this.url}/${"update-booking"}`,booking);
  }

  deleteBooking(id:number):Observable<Boolean>{
    console.log("service lopala");
    return this.httpClient.delete<Boolean>(`${this.url}/${"delete-booking"}/${id}`);
  }

  getById(id:number):Observable<BookedSeats>{
    return this.httpClient.get<BookedSeats>(`${this.url}/${"booking"}/${id}`);
  }

  findallById(id:number):Observable<BookedSeats[]>{
    return this.httpClient.get<BookedSeats[]>(`${this.url}/${"all-bookings"}/${id}`)
  }
}
