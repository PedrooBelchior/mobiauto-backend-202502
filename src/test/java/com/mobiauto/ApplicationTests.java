package com.mobiauto;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = Application.class) // Explicitamente define a classe de configuração
@SpringBootTest
public class ApplicationTests {

    @Test
    void contextLoads() {
        // Teste básico
    }
}
