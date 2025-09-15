package com.example.primeiros_passos.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {

    @Autowired
    Remetente remetente;

    @Override
    public void run(String... args) throws Exception {
        System.out.printf(
                "Mensagem enviada por: %s\nEmail: %s\nTelefones para contato: %s\n",
                remetente.getNome(), remetente.getEmail(), remetente.getTelefones()
        );
        System.out.println("Seu cadastro foi aprovado!");
    }
}
