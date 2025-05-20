package com.example.demo.repository;

import com.example.demo.usuarios.Lista_alunos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListaAlunosRepository  extends JpaRepository<Lista_alunos, Long> {

}