package com.example.demo.controler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/")
public class HomeControler {
    @GetMapping
    public String paginapesquisa() {
        return "Nota_de_alunos";
    }
}

