package com.example.demo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/pagina_principal")
public class Pesquisa {
    @GetMapping
    public String pesquisa (){
    return "Nota_de_alunos";
    }
}
