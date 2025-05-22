
package com.example.demo.controler;

import com.example.demo.usuarios.Lista_alunos;
import com.example.demo.repository.ListaAlunosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/cadastro_aluno")
public class Controler_cadastro {

    @Autowired
    private ListaAlunosRepository repository;


    @GetMapping
    public String Cadastra_Produto() {
        return "pagina_de_cadastro";
    }

    @PostMapping
    public String cadastraProduto(@RequestParam String nome, @RequestParam String media,
                                  @RequestParam String serie, @RequestParam String aprovado) {
        try {
            Lista_alunos aluno = new Lista_alunos(nome, serie, media, aprovado);
            repository.save(aluno);
            return "Nota_de_alunos";
        } catch (Exception e) {
            return "Erro: " + e.getMessage();
        }
    }

}