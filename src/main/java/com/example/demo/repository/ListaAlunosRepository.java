package com.example.demo.repository;


import com.example.demo.usuarios.Lista_alunos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public interface ListaAlunosRepository  extends JpaRepository<Lista_alunos, Long> {
    List<Lista_alunos> findByNomeContaining(String nome);


}