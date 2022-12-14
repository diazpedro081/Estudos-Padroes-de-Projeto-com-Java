package br.com.padroes.projeto.java.creationalPatterns.builder.src.domain;

import java.math.BigDecimal;

public class Produto {
    
    private String nome;
    private int quantidade;
    private BigDecimal valor;

    public Produto() {
    }

    public Produto(String nome, int quantidade, BigDecimal valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "\n" + nome +
         "\nQuantidade: " + quantidade +
          "\nValor do produto: R$" + valor;
    }

    

}   
