package com.example.primeiros_passos.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {

    @Value("${name:valorAlternativo}")
    private String nome;

    @Value("${email}")
    private String email;

    @Value("${telefone}")
    private List<Long> telefone;

    @Override
    public void run(String... args) throws Exception {
        System.out.printf(
                "Mensagem enviada por: %s\nEmail: %s\nTelefones para contato: %s\n", nome, email, telefone
        );
        System.out.println("Seu cadastro foi aprovado!");
    }
}
