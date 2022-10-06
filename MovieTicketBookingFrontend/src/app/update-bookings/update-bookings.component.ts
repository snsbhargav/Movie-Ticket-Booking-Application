import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BookedSeats } from '../BookedSeats';
import { BookingService } from '../booking.service';
import { movie } from '../movie';
import { MovieService } from '../movie.service';
import { screen } from '../screen';
import { ScreenService } from '../screen-service.service';

@Component({
  selector: 'app-update-bookings',
  templateUrl: './update-bookings.component.html',
  styleUrls: ['./update-bookings.component.css']
})
export class UpdateBookingsComponent implements OnInit {

  constructor(private movieService:MovieService,private screenService:ScreenService,
    private route:ActivatedRoute,private bookingService:BookingService,private router:Router) { }
  userid!:number;
  movieid!:number;
  bookindId!:number;
  mov:movie = new movie();
  scr:screen = new screen();
  today = new Date();
  amount!:number;
  ngOnInit(): void {
    this.userid = this.route.snapshot.params['userId'];
    this.movieid = this.route.snapshot.params['movieId'];
    this.bookindId = this.route.snapshot.params['bookingId'];
    this.movieService.getMovie(this.movieid).subscribe(data=>{
      this.mov = data;
      console.log(data,typeof(this.movieid));
    });
    this.movieService.getScreenId(this.movieid).subscribe(num=>{
      this.screenService.getScreen(num).subscribe(data=> {
        this.scr = data;
          console.log("fasak",this.scr);
      });
    });
  }
  count!:number;
  price!:number;
  seatType!:String;
  seat(s:String){
    if(s==="platinum"){
      this.price = this.scr.platinumSeats;
    }
    else if(s==="gold"){
      this.price = this.scr.goldSeat;
    }
    else{
      this.price = this.scr.silverSeats;
    }

    this.seatType = s;
  }
  calc(){
    this.amount = this.price*this.count;
  }
  slot(t:string){
    this.booking.time = t;
  }

  booking:BookedSeats = new BookedSeats();
  submit(){
    this.booking.bookingId = this.bookindId;
    this.booking.amount = this.amount;
    this.booking.noOfSeats = this.count;
    this.booking.screenName = this.scr.name;
    this.booking.movieId = this.mov.id;
    this.booking.movieName = this.mov.title;
    this.booking.seatType = this.seatType;
    this.booking.userId = this.userid;
    console.log("booking:",this.booking);
    this.bookingService.updateBooking(this.booking).subscribe(data=>console.log(data));
    alert("Updated Successfully");
    this.router.navigate(["home",this.userid,"movie"]);

  }
  movielink(){
    this.router.navigate(["home",this.mov.id,"movie"]);
  }
  mybooking(){
    this.router.navigate(["home",this.mov.id,"my-bookings"]);
  }
  mydetails(){
    this.router.navigate(["home",this.mov.id,"my-details"]);
  }
  logout(){
    this.router.navigate(["login"]);
  }

}
