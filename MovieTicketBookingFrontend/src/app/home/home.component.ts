import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Route, Router } from '@angular/router';
import { User } from '../User';
import { UserService } from '../user.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private service:UserService,private router:ActivatedRoute,private route:Router) { }
  user:User = new User();
  id!:number;
  ngOnInit(): void {
    this.id = this.router.snapshot.params['userId'];
    console.log(this.id);
    this.service.getUser(this.id).subscribe(data=>this.user = data);
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
