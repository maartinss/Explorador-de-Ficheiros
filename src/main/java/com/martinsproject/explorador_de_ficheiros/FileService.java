package com.martinsproject.explorador_de_ficheiros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import java.util.List;

@Service
public class FileService {
    @Autowired
    private FileRepository fileRepository;

    public List<FileEntity> getFilesByPath(String path) {
        return fileRepository.findByPath(path);
    }
    public List<FileEntity> getFilesById(Long id) {
        return fileRepository.findByFileId(id);
    }

    public FileEntity saveFile(FileEntity file) {
        return fileRepository.save(file);
    }

    public void deleteFile(FileEntity file) {
        fileRepository.delete(file);
    }

    public void deleteFileById(Long id) {
        fileRepository.deleteById(id);
    }
}
