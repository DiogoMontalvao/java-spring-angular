package com.example2.__spring_web_rest.controller;

import com.example2.__spring_web_rest.exception.ProdutoNullException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ProdutoControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ProdutoNullException.class)
    public ResponseEntity<Object> capturaNull() {
        Map<String, Object> body = new HashMap<>();
        body.put("message", "Verifique os campos de produto.");

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
    }
}
