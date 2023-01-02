package br.com.padroes.projeto.java.creationalPatterns.abstractFactory.src;

import br.com.padroes.projeto.java.creationalPatterns.abstractFactory.src.domain.Pizza;
import br.com.padroes.projeto.java.creationalPatterns.abstractFactory.src.domain.Pizza.Sabor;
import br.com.padroes.projeto.java.creationalPatterns.abstractFactory.src.factories.AbstractFactory;
import br.com.padroes.projeto.java.creationalPatterns.abstractFactory.src.factories.PizzariaAguaVerdeFactory;

public class AppPizzaria {
    public static void main(String[] args) {
        AbstractFactory factory = new PizzariaAguaVerdeFactory();
        Pizza pizza = factory.pedirPizza(Sabor.CALABRESA);

        System.out.println(pizza);
    }
}
