package com.martinsproject.explorador_de_ficheiros;

import org.springframework.boot.SpringApplication;

public class TestExploradorDeFicheirosApplication {

    public static void main(String[] args) {
        SpringApplication.from(ExploradorDeFicheirosApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
