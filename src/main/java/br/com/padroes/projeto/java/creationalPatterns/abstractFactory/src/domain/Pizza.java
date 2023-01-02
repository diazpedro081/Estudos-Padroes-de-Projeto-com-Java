package br.com.padroes.projeto.java.creationalPatterns.abstractFactory.src.domain;

import java.util.ArrayList;
import java.util.List;

abstract public class Pizza {
    
    public static enum Sabor {
        CALABRESA,
        PEPPERONI,
        QUEIJO,
        VEGANA
    }

    String nome;
    String massa;
    String molho;
    List<String> coberturas = new ArrayList<String>();

    public String getNome() {
        return nome;
    }
    
    public void preparar() {
        System.out.println("Preparando " + nome);
    }

    public void assar() {
        System.out.println("Assando " + nome);
    }

    public void cortar() {
        System.out.println("Cortando " + nome);
    }

    public void embalar() {
        System.out.println("Embalando " + nome);
    }

    @Override
    public String toString() {
        return "A Pizza de " + nome + ", tem a massa de " + massa + " com molho de " + molho + " e cobertura de " + coberturas;
    }

}
 