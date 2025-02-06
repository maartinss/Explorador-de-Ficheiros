package com.martinsproject.explorador_de_ficheiros.fileexplorer.controller;

import com.martinsproject.explorador_de_ficheiros.fileexplorer.entity.FileEntity;
import com.martinsproject.explorador_de_ficheiros.fileexplorer.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/files")
public class FileController {
    @Autowired
    private FileService fileService;

    @GetMapping("/{path}")
    public ResponseEntity<List<FileEntity>> getFiles(@PathVariable String path) {
        List<FileEntity> files = fileService.getFilesByPath(path);
        return ResponseEntity.ok(files);
    }

    @PostMapping
    public ResponseEntity<FileEntity> createFile(@RequestBody FileEntity file) {
        FileEntity savedFile = fileService.saveFile(file);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedFile);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<FileEntity> deleteFile(@PathVariable Long id) {
        fileService.deleteFileById(id);
        return ResponseEntity.noContent().build();
    }
}
