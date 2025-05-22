package com.example.demo;

import com.example.demo.repository.ListaProf;
import com.example.demo.repository.RepositorioProf;
import com.example.demo.usuarios.Lista_professores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class service_login {

    private final ListaProf Login;

    public service_login(ListaProf login) {
        this.Login = login;
    }
    public List<Lista_professores> buscarClientesPorNome(String nome,String numero_matricula) {
        return Login.findByNomeAndNumeroMatriculaContains(nome,numero_matricula);
    }
}
