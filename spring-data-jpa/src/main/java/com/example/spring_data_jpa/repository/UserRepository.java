package com.example.spring_data_jpa.repository;

import com.example.spring_data_jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findByNameContaining(String name);

    @Query("SELECT u FROM User u WHERE u.name LIKE %:name%")
    List<User> encontrarPorNome(@Param("name") String name);
}
