import { Routes } from '@angular/router';

export const routes: Routes = [
  {
    path: 'authors', // Lazy load the AuthorsModule
    loadChildren: () =>
      import('./authors/authors.module').then((m) => m.AuthorsModule),
  },
  { path: '', redirectTo: 'authors', pathMatch: 'full' }, // Redirect default route to authors
];
