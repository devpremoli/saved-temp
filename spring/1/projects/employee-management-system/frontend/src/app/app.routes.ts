import { Routes } from '@angular/router';

export const routes: Routes = [
    {
        path: 'employees',
        loadChildren: () => import('./employee/employee.module').then(m => m.EmployeeModule),
      },
      { path: '', redirectTo: '/employees', pathMatch: 'full' }, // Redirect to employees by default
      { path: '**', redirectTo: '/employees' }, // Fallback route
];
