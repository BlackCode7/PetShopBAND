import { NgModule } from '@angular/core';
import { ExtraOptions, RouterModule, Routes } from '@angular/router';
 //'@nebular/auth'
//import { NbAuthComponent } from '@nebular/auth/'


const routes: Routes = [

  /* Configuração das rotas para as páginas */

  {
    // Tela inicial da aplicação
    path: 'app',
    loadChildren: () => import('./app.module')
      .then(m => m.AppModule), 
  },
  // Tela de autenticação da aplicação Auth >>> Login/Register/ResquestPassword/ResetPassword >>> criação dessas telas

  {
   path: 'auth',
   //component: NbAuthComponent, 
   children: []
  }

];

const config: ExtraOptions = {
  useHash: false,
};
@NgModule({
  imports: [RouterModule.forRoot(routes, config)],
  exports: [RouterModule],
})
export class AppRoutingModule { }
