import { bootstrapApplication } from '@angular/platform-browser';
import { HomeComponent } from './app/home/home';

bootstrapApplication(HomeComponent)
  .catch(err => console.error(err));
