package br.com.padroes.projeto.java.creationalPatterns.abstractFactory.src.domain;

public class PizzaDeCalabrezaBairro extends Pizza{
    
    public PizzaDeCalabrezaBairro() {
        nome = "Pizza de calabresa";
        massa = "crosta fina";
        molho = "molho de alho branco";
        coberturas.add("Calabresa");
        coberturas.add("Queijo parmesão ralado");
    }
}
