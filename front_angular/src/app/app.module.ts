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
import { CardVagaComponent } from './components/card-vaga/card-vaga.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { CardEmpresaCarrosselComponent } from './components/card-empresa-carrossel/card-empresa-carrossel.component';
import { EmpresaCarrosselComponent } from './components/empresa-carrossel/empresa-carrossel.component';
import { ModalLoginComponent } from './components/modal-login/modal-login.component';
import { PainelCandidataComponent } from './components/pages/painel-candidata/painel-candidata.component';
import { MenuPainelComponent } from './components/menu-painel/menu-painel.component';
import { DadosPessoaisComponent } from './components/dados-pessoais/dados-pessoais.component';
import { DadosAcademicosComponent } from './components/dados-academicos/dados-academicos.component';
import { ExperienciaProfissionalComponent } from './components/experiencia-profissional/experiencia-profissional.component';

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
    VagasComponent,
    CardVagaComponent,
    CardEmpresaCarrosselComponent,
    EmpresaCarrosselComponent,
    ModalLoginComponent,
    PainelCandidataComponent,
    MenuPainelComponent,
    DadosPessoaisComponent,
    DadosAcademicosComponent,
    ExperienciaProfissionalComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FontAwesomeModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
