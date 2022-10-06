import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { User } from '../User';
import { UserService } from '../user.service';

@Component({
  selector: 'app-my-details',
  templateUrl: './my-details.component.html',
  styleUrls: ['./my-details.component.css']
})
export class MyDetailsComponent implements OnInit {

  constructor(private userService:UserService, private route:Router, private router:ActivatedRoute) { }
  user:User = new User();
  id!:number;
  ngOnInit(): void {
    this.id = this.router.snapshot.params['userId'];
    this.userService.getUser(this.id).subscribe(data=>this.user = data);
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
