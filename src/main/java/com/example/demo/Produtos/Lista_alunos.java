package com.example.demo.Produtos;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
@Table(name = "lista_alunos")
public class Lista_alunos {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nome",nullable = false)
    private String nome;
    @Column(name = "serie",nullable = false)
    private String serie;
    @Column(name = "media",nullable = false)
    private String media;
    @Column(name = "aprovado",nullable = false)
    private boolean aprovado;

    public Lista_alunos(String nome, String serie, String media, boolean aprovado) {
        this.nome = nome;
        this.serie = serie;
        this.media = media;
        this.aprovado = aprovado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
