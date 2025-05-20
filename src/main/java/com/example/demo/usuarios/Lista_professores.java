package com.example.demo.usuarios;

import jakarta.persistence.*;

@Entity
@Table(name = "Lista_prof")
public class Lista_professores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name ="nome" ,nullable = false )
    private String nome;
    @Column(name ="numero_matricula" ,nullable = false )
    private String numero_matricula;
    @Column(name ="salario" ,nullable = false )
    private int salario;
    @Column(name ="ativo" ,nullable = false )
    private boolean ativo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero_matricula() {
        return numero_matricula;
    }

    public void setNumero_matricula(String numero_matricula) {
        this.numero_matricula = numero_matricula;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
