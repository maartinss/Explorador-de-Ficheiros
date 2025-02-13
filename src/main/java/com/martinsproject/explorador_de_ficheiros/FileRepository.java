package com.martinsproject.explorador_de_ficheiros;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public interface FileRepository extends JpaRepository<FileEntity, Long> {
    List<FileEntity> findByPath(String path);

    List<FileEntity> findByFileId(Long fileId);
}
