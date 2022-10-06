import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../User';
import { UserService } from '../user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private service:UserService, private router:Router) { }

  tempUser!:number;
  tempPassword!:String;
  // user:User = new User();
  ngOnInit(): void {
  }
  submit(){
    this.service.getUser(this.tempUser).subscribe(data=>
      {
        console.log(this.tempUser,this.tempPassword,data);
        if(data===null){
          alert("OOps Wrong credentials mate!");
        }
        else{
          if(data.password==this.tempPassword){
            // alert("Welcome user");
            this.router.navigate(["home",data.id]);
          }
          else{
            alert("OOps Wrong credentials mate! try again"); 
          }
        }
      });
  }
  register(){
    this.router.navigate(["register"]);
  }

}
