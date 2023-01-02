package br.com.padroes.projeto.java.creationalPatterns.abstractFactory.src.domain;

public class PizzaVegana extends Pizza{

    public PizzaVegana() {
        nome = "Pizza de cogumelo";
        massa = "massa fina";
        molho = "molho de ervas";
        coberturas.add("Calda de cogumelo"); 
    }
}
