package com.example.primeiros_passos.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {

    @Autowired
    Remetente padrao;

    @Autowired
    Remetente novo;

    public void confirmacaoCadastro() {
        System.out.println(padrao);
        System.out.println("Cadastro realizado.");
    }

    public void mensagemBoasVindas() {
        novo.setNome("Novo");
        novo.setEmail("novoEmail@email.com");

        System.out.println(novo);
        System.out.println("Bem vindo!");
    }
}
