import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { LoginComponent } from './auth/login/login.component';
import { RegisterComponent } from './auth/register/register.component';

const routes: Routes = [
  {path: '', component: AppComponent},
  {path: 'login', component: LoginComponent},
  {path: 'register', component: RegisterComponent}
];
  
  // children: [
  //   {
  //     path: 'login',
  //     loadChildren: () => import('./auth/login/login.module').then(m => m.LoginModule)
  //   },
  //   {
  //     path: 'register',
  //     loadChildren: () => import('./auth/register/register.module').then(m => m.RegisterModule)
  //   }
  // ]


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
