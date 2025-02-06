package com.martinsproject.explorador_de_ficheiros.fileexplorer.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "files")
public class FileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String path;
    private Long size;
    private String type;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

}
