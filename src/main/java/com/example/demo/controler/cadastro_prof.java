package com.example.demo.controler;

import com.example.demo.repository.RepositorioProf;
import com.example.demo.usuarios.Lista_professores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/cadastro_prof")
public class cadastro_prof {
    @Autowired
    RepositorioProf repositorio;
    @GetMapping
    public String cadastra_prof(){
        return "Cadastro_prof";
    }
    @PostMapping
    public String info(@RequestParam String nome,@RequestParam String numero_matricula,@RequestParam int salario,@RequestParam boolean ativo){
        try{
            Lista_professores prof = new Lista_professores(nome,numero_matricula,salario,ativo);
            repositorio.save(prof);
            return "Nota_de_alunos";
        }
        catch (Exception e){
            return "Erro: " + e.getMessage();
        }
    }

}
