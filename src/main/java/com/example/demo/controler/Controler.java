package com.example.demo.controler;
import com.example.demo.Produtos.Alunos;
import com.example.demo.Produtos.Lista_alunos;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Controler {

    @GetMapping("/login")
    public String Cadastra_Produto() {
        return "pagina_de_login";
    }
    @PostMapping
    public String processo_lista(@RequestParam String nome,@RequestParam String media,@RequestParam String serie,@RequestParam boolean aprovado){
        Lista_alunos alunos = new Lista_alunos(nome,media,serie,aprovado);
        return "cadastro feito com sucesso";
    }
}
