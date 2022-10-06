import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BookedSeats } from '../BookedSeats';
import { BookingService } from '../booking.service';
import { MovieService } from '../movie.service';
import { User } from '../User';
import { UserService } from '../user.service';

@Component({
  selector: 'app-my-bookings',
  templateUrl: './my-bookings.component.html',
  styleUrls: ['./my-bookings.component.css']
})
export class MyBookingsComponent implements OnInit {

  constructor(private router:ActivatedRoute,private route:Router, private bookingService:BookingService,
    private userService:UserService , private movieService:MovieService) { }
  id!:number;
  bookings:BookedSeats[] = [];
  ngOnInit(): void {
    this.id = this.router.snapshot.params['userId'];
    console.log(this.id,typeof(this.id));
    this.retriveData();
    
  }
  retriveData(){
    this.bookingService.findallById(this.id).subscribe(data =>{
      this.bookings = data;
      console.log(data);
    });
  }
  booking!:BookedSeats;
  update(id:number){
    this.bookingService.getById(id).subscribe(data=>{
      this.booking = data;
      this.route.navigate(["home",this.booking.userId,"movie",this.booking.movieId,"update-booking",id]);
    });

  }
  cancel(id:number){
    this.bookingService.deleteBooking(id).subscribe(data=>console.log(data));
    alert("Booking Canceled "+id);
    this.retriveData();
  }

  movielink(){
    this.route.navigate(["home",this.id,"movie"]);
  }
  mybooking(){
    this.route.navigate(["home",this.id,"my-bookings"]);
  }
  mydetails(){
    this.route.navigate(["home",this.id,"my-details"]);
  }
  logout(){
    this.route.navigate(["login"]);
  }
}
