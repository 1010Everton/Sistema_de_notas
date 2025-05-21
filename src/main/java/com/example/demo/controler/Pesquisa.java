package com.example.demo.controler;

import com.example.demo.Servicos;
import com.example.demo.usuarios.Lista_alunos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class Pesquisa {
    @Autowired
    private Servicos usuarioService;


    public Pesquisa(Servicos usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public String paginapesquisa() {
        return "Nota_de_alunos";
    }

    @GetMapping("/clientes")
    public List<Lista_alunos> listarClientes(@RequestParam String nome) {
        try {
            return usuarioService.buscarClientesPorNome(nome);
        }
        catch (Exception e){
            System.out.print(e);

        }
        return null;
    }

}

