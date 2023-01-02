package br.com.padroes.projeto.java.creationalPatterns.abstractFactory.src.domain;

public class PizzaDeCalabrezaCentro extends Pizza {
    
    public PizzaDeCalabrezaCentro() {
        nome = "Pizza de calabresa";
        massa = "crosta fina";
        molho = "Molho de alho branco";
        coberturas.add("calabresa");
        coberturas.add("queijo parmesão ralado");
    }
}
