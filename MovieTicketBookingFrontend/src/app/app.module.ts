import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';
import { MovieComponent } from './movie/movie.component';
import { MovieDetailsComponent } from './movie-details/movie-details.component';
import { BookTicketComponent } from './book-ticket/book-ticket.component';
import { MyBookingsComponent } from './my-bookings/my-bookings.component';
import { MyDetailsComponent } from './my-details/my-details.component';
import { UpdateBookingsComponent } from './update-bookings/update-bookings.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    HomeComponent,
    MovieComponent,
    MovieDetailsComponent,
    BookTicketComponent,
    MyBookingsComponent,
    MyDetailsComponent,
    UpdateBookingsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
