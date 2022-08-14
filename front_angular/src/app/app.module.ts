import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { CadastroComponent } from './components/pages/cadastro/cadastro.component';
import { CandidatasComponent } from './components/pages/candidatas/candidatas.component';
import { EmpresasComponent } from './components/pages/empresas/empresas.component';
import { HomeComponent } from './components/pages/home/home.component';
import { InstitucionalComponent } from './components/pages/institucional/institucional.component';
import { VagasComponent } from './components/pages/vagas/vagas.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    CadastroComponent,
    CandidatasComponent,
    EmpresasComponent,
    HomeComponent,
    InstitucionalComponent,
    VagasComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
