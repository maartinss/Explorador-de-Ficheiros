// file-explorer-frontend/src/app/app.component.ts
import { Component } from '@angular/core';
import { FileListComponent } from './file-list/file-list.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  standalone: true,
  imports: [FileListComponent]
})
export class AppComponent {
  title = 'file-explorer-frontend';
}