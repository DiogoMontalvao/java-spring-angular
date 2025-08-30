package com.example.primeiros_passos.app;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;

public class BeansFactory {

    @Bean
    public Gson gson() {
        return new Gson();
    }
}
