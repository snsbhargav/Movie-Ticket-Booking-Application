import { Component, OnInit } from '@angular/core';
import { Route, Router } from '@angular/router';
import { User } from '../User';
import { UserService } from '../user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private service:UserService,private router:Router) { }
  user:User = new User();

  ngOnInit(): void {
  }

  submit(){
    this.service.regsterUser(this.user).subscribe(data=>console.log(data));
    alert("User Created Successfully");
    this.router.navigate(["login"]);
  }
}
