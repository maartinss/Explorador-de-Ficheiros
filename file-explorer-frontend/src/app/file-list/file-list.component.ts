// file-explorer-frontend/src/app/file-list/file-list.component.ts
import { Component, OnInit } from '@angular/core';
import { FileService } from '../file.service';

@Component({
  selector: 'app-file-list',
  templateUrl: './file-list.component.html',
  styleUrls: ['./file-list.component.css']
})
export class FileListComponent implements OnInit {
  files: any[] = [];
  currentPath: string = '/';

  constructor(private fileService: FileService) { }

  ngOnInit(): void {
    this.loadFiles(this.currentPath);
  }

  loadFiles(path: string): void {
    this.fileService.getFiles(path).subscribe(data => {
      this.files = data;
      this.currentPath = path;
    });
  }

  navigateTo(file: any): void {
    if (file.isDirectory) {
      this.loadFiles(`${this.currentPath}/${file.name}`);
    }
  }

  goBack(): void {
    const pathParts = this.currentPath.split('/').filter(part => part);
    pathParts.pop();
    this.loadFiles(`/${pathParts.join('/')}`);
  }
}