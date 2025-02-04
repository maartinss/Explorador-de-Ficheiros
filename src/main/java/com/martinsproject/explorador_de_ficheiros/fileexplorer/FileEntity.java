package com.martinsproject.explorador_de_ficheiros.fileexplorer;
import lombok.Getter;

import java.io.File;

@Getter
public class FileEntity {
    private final String name;
    private final int id;
    private final long size;

    public FileEntity(String name, int id, long size) {
        this.name = name;
        this.id = id;
        this.size = size;
    }
}
