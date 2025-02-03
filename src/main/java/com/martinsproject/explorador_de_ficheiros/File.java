package com.martinsproject.explorador_de_ficheiros;

import org.springframework.beans.factory.annotation.Autowired;

public class File {
    private File file;

    public File(File file) {
        this.file = file;
    }
}
