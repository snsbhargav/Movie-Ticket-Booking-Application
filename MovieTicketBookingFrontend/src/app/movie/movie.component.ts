import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { movie } from '../movie';
import { MovieService } from '../movie.service';

@Component({
  selector: 'app-movie',
  templateUrl: './movie.component.html',
  styleUrls: ['./movie.component.css']
})
export class MovieComponent implements OnInit {

  constructor(private service:MovieService,private router:Router, private route:ActivatedRoute) { }
  // val!:String
  movies:movie[] = [];
  nodata = false;
  userid!:number
  ngOnInit(): void {
    this.userid = this.route.snapshot.params['userId'];
  }
  update(val:String){

    if(val=="Both"){
      this.service.allMovies().subscribe(data=>{
        this.movies=data;
        if(data.length==0){
          this.nodata=true;
        }
        else
          this.nodata=false;
      });
    }
    else if(val=="PVR"){
      this.service.PvrMovies().subscribe(data=>{
        this.movies=data;
        if(data.length==0){
          this.nodata=true;
        }
        else
          this.nodata=false;
      });
    }
    else{
      this.service.InoxMovies().subscribe(data=>{
        this.movies=data
        if(data.length==0){
          this.nodata=true;
        }
        else
          this.nodata=false;
      });
    }
    console.log(this.movies.length);
    
    console.log(this.movies);

  }
  movieDetails(movieId:number){
    this.router.navigate(["home",this.userid,"movie",movieId,"movieDeatils"]);
  }
  book(movieId:number){
    this.router.navigate(["home",this.userid,"movie",movieId,"bookTicket"]);
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
