package com.martinsproject.explorador_de_ficheiros;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class ExploradorDeFicheirosApplicationTests {

    @Test
    void contextLoads() {
    }

}
