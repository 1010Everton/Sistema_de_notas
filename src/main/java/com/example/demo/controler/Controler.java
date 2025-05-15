package com.example.demo.controler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {

    @GetMapping("/")
    public String Cadastra_Produto() {
        return "Produto cadastrado com sucesso!";
    }
}
