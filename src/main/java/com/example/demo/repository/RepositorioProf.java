package com.example.demo.repository;

import com.example.demo.usuarios.Lista_professores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositorioProf extends JpaRepository<Lista_professores, Long> {
}