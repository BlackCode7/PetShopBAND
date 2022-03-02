import { NgModule, CUSTOM_ELEMENTS_SCHEMA, NO_ERRORS_SCHEMA } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NbActionsModule,  NbButtonModule,
  NbCardModule,  NbCheckboxModule,
  NbDatepickerModule, NbIconModule,
  NbInputModule,  NbLayoutModule,
  NbListModule,  NbRadioModule,
  NbSelectModule,  NbThemeModule,
  NbUserModule} 
  from '@nebular/theme';
import { LoginComponent } from './login.component';


@NgModule({
  declarations: [
    LoginComponent
  ],
  schemas: [ CUSTOM_ELEMENTS_SCHEMA, NO_ERRORS_SCHEMA ],
  imports: [    
    NbLayoutModule,
    NbListModule,
    CommonModule,
    NbThemeModule,
    NbCardModule,
    NbActionsModule,
    NbButtonModule,
    NbCheckboxModule,
    NbDatepickerModule, 
    NbIconModule,
    NbInputModule,
    NbRadioModule,
    NbSelectModule,
    NbUserModule
  ]
})
export class LoginModule { }
