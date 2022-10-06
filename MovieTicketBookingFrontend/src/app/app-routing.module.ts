import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { BookTicketComponent } from './book-ticket/book-ticket.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { MovieDetailsComponent } from './movie-details/movie-details.component';
import { MovieComponent } from './movie/movie.component';
import { MyBookingsComponent } from './my-bookings/my-bookings.component';
import { MyDetailsComponent } from './my-details/my-details.component';
import { RegisterComponent } from './register/register.component';
import { UpdateBookingsComponent } from './update-bookings/update-bookings.component';

const routes: Routes = [
  {path:"login",component:LoginComponent},
  {path:"register",component:RegisterComponent},
  {path:"home/:userId",component:HomeComponent},
  {path:"home/:userId/movie",component:MovieComponent},
  {path:"home/:userId/movie/:movieId/movieDeatils",component:MovieDetailsComponent},
  {path:"home/:userId/movie/:movieId/update-booking/:bookingId",component:UpdateBookingsComponent},
  {path:"home/:userId/movie/:movieId/bookTicket",component:BookTicketComponent},
  {path:"home/:userId/my-bookings",component:MyBookingsComponent},
  {path:"home/:userId/my-details",component:MyDetailsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
