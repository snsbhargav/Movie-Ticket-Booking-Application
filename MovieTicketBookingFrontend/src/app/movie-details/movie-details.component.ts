import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { movie } from '../movie';
import { MovieService } from '../movie.service';

@Component({
  selector: 'app-movie-details',
  templateUrl: './movie-details.component.html',
  styleUrls: ['./movie-details.component.css']
})
export class MovieDetailsComponent implements OnInit {

  constructor(private service:MovieService,private router:Router, private route:ActivatedRoute) { }

  userid!:number;
  movieid!:number;
  movie:movie = new movie();
  ngOnInit(): void {
    this.userid = this.route.snapshot.params['userId'];
    this.movieid = this.route.snapshot.params['movieId'];
    console.log(this.userid,this.movieid);
    this.service.getMovie(this.movieid).subscribe(data=>{
      this.movie = data;
      console.log(data);
    });
  }
  goback(){
    this.router.navigate(["home",this.userid,"movie"]);
  }
  book(){
    this.router.navigate(["home",this.userid,"movie",this.movieid,"bookTicket"]);
  }
  movielink(){
    this.router.navigate(["home",this.userid,"movie"]);
  }
  mybooking(){
    this.router.navigate(["home",this.userid,"my-bookings"]);
  }
  mydetails(){
    this.router.navigate(["home",this.userid,"my-details"]);
  }
  logout(){
    this.router.navigate(["login"]);
  }

}
