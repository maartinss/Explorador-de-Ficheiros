package com.martinsproject.explorador_de_ficheiros.fileexplorer.repository;

import com.martinsproject.explorador_de_ficheiros.fileexplorer.entity.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public interface FileRepository extends JpaRepository<FileEntity, Long> {
    List<FileEntity> findByPath(String path);

    List<FileEntity> findByFileId(Long id);
}
