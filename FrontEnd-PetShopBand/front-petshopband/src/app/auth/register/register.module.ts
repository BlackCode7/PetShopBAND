import { CUSTOM_ELEMENTS_SCHEMA, NgModule, NO_ERRORS_SCHEMA } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NbActionsModule, 
  NbButtonModule, NbCardModule, 
  NbCheckboxModule, NbDatepickerModule, 
  NbIconModule, NbInputModule, NbLayoutModule, 
  NbListModule, NbRadioModule, NbSelectModule, 
  NbThemeModule, NbUserModule } 
  from '@nebular/theme';



@NgModule({
  declarations: [],
  schemas: [ CUSTOM_ELEMENTS_SCHEMA, NO_ERRORS_SCHEMA ],
  imports: [
    CommonModule,
    NbLayoutModule,
    NbListModule,
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
export class RegisterModule { }
