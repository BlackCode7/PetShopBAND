import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  // `
  // <ngx-one-column-layout>
  //   <router-outlet>
  //     <app-login></app-login>
  //   </router-outlet>
  // </ngx-one-column-layout>  
  // `,
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
