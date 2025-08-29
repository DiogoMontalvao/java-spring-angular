package com.example.primeiros_passos;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    public int somar(int um, int dois) {
        return um + dois;
    }
}
