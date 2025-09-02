package com.example.primeiros_passos.app;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeansFactory {

    @Bean
    @Scope("prototype")
    public Remetente remetente() {
        System.out.println("===== Criando Objeto Remetente. =====");

        Remetente remetente = new Remetente();

        remetente.setNome("Padrão");
        remetente.setEmail("padrao@email.com");

        return remetente;
    }
}
