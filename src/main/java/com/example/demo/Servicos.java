package com.example.demo;

import com.example.demo.controler.DTOPesquisa;
import com.example.demo.repository.ListaAlunosRepository;
import com.example.demo.usuarios.Lista_alunos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class Servicos {

    private final ListaAlunosRepository lista;

    public Servicos(ListaAlunosRepository lista) {
        this.lista = lista;
    }
    public List<Lista_alunos> buscarClientesPorNome(String nome) {
        return lista.findByNomeContaining(nome);
    }



}


