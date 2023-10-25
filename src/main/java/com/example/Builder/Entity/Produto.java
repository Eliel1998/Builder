package com.example.Builder.Entity;

public class Produto {
    private long id;
    private String titulo;
    private String descricao;
    private String marca;
    private String modelo;
    private int estoque;
    private double preco;

    private Produto(Builder builder) {
        this.id = builder.id;
        this.titulo = builder.titulo;
        this.descricao = builder.descricao;
        this.marca = builder.marca;
        this.modelo = builder.modelo;
        this.estoque = builder.estoque;
        this.preco = builder.preco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static class Builder {
        private long id;
        private String titulo;
        private String descricao;
        private String marca;
        private String modelo;
        private int estoque;
        private double preco;

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder titulo(String titulo) {
            this.titulo = titulo;
            return this;
        }

        public Builder descricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public Builder marca(String marca) {
            this.marca = marca;
            return this;
        }

        public Builder modelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public Builder estoque(int estoque) {
            this.estoque = estoque;
            return this;
        }

        public Builder preco(double preco) {
            this.preco = preco;
            return this;
        }

        public Produto build() {
            return new Produto(this);
        }
    }
}
