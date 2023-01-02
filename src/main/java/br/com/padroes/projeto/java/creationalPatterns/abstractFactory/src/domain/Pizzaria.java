package br.com.padroes.projeto.java.creationalPatterns.abstractFactory.src.domain;

public abstract class Pizzaria {
    
    public static enum Localidade {
        CENTRO,
        AGUAVERDE
    }

    abstract Pizza produzirPizza(Pizza.Sabor sabor);

    public Pizza pedirPizza(Pizza.Sabor sabor) {
        Pizza pizza = produzirPizza(sabor);
        System.out.println("Preparando a " + pizza.getNome() + "");
        pizza.preparar();
        pizza.assar();
        pizza.cortar();
        pizza.embalar();
        return pizza;
    }
}
