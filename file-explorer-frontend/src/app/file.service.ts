// filepath: /c:/Users/rodri/IdeaProjects/Explorador-de-Ficheiros/file-explorer-frontend/src/app/file.service.ts
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FileService {
  private apiUrl = 'http://localhost:8080/api/files';

  constructor(private http: HttpClient) { }

  getFiles(path: string): Observable<any> {
    return this.http.get(`${this.apiUrl}?path=${path}`);
  }
}