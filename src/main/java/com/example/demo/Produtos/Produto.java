package com.example.demo.Produtos;

import java.util.Scanner;

public class Produto {
    public String cadastro_de_produto() {
        Scanner inserir = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = inserir.nextLine();
        inserir.close(); // Feche o Scanner para evitar vazamentos de recursos
        return "Produto cadastrado: " + nomeProduto;
    }
}
