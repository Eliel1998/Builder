package com.example.Builder;

import com.example.Builder.Entity.Produto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderApplication {

    public static void main(String[] args) {

        SpringApplication.run(BuilderApplication.class, args);

        Produto produto = new Produto.Builder()
            .id(1)
            .titulo("Produto 1")
            .descricao("Descrição do produto 1")
            .marca("Marca do produto 1")
            .modelo("Modelo do produto 1")
            .estoque(10)
            .preco(100.00)
            .build();

        System.out.println("ID: " + produto.getId());
        System.out.println("Título: " + produto.getTitulo());
        System.out.println("Descrição: " + produto.getDescricao());
        System.out.println("Marca: " + produto.getMarca());
        System.out.println("Modelo: " + produto.getModelo());
        System.out.println("Estoque: " + produto.getEstoque());
        System.out.println("Preço: " + produto.getPreco());
    }

}
