import { Routes } from '@angular/router';

import { HomeComponent } from './pages/home/home.component';
import { UsuariosComponent } from './pages/usuarios/usuarios.component';
import { FormacaoComponent } from './pages/formacao/formacao.component';
import { ExperienciaComponent } from './pages/experiencia/experiencia.component';

export const routes: Routes = [
  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'usuarios',
    component: UsuariosComponent
  },
  {
    path: 'formacao',
    component: FormacaoComponent
  },
  {
    path: 'experiencia',
    component: ExperienciaComponent
  }
];
