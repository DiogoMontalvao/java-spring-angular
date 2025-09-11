package com.example.spring_data_jpa;

import com.example.spring_data_jpa.model.User;
import com.example.spring_data_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Autowired
    private User user;

    @Override
    public void run(String... args) throws Exception {
        user.setName("Diogo Doir");
        user.setUsername("Chatudor");
        user.setPassword("123456");

        repository.save(user);

        List<User> lista = repository.findAll();
        System.out.println(lista);
    }
}
