package br.com.padroes.projeto.java.creationalPatterns.abstractFactory.src.factories;

import br.com.padroes.projeto.java.creationalPatterns.abstractFactory.src.domain.Pizza;
import br.com.padroes.projeto.java.creationalPatterns.abstractFactory.src.domain.Pizzaria;
import br.com.padroes.projeto.java.creationalPatterns.abstractFactory.src.domain.PizzariaCentro;
import br.com.padroes.projeto.java.creationalPatterns.abstractFactory.src.domain.Pizza.Sabor;

public class PizzariaCentroFactory extends PizzariaFactory{

    private Pizzaria pizzaria;

    public PizzariaCentroFactory() {
        pizzaria = new PizzariaCentro();
    }

    @Override
    public Pizza pedirPizza(Sabor sabor) {
        return pizzaria.pedirPizza(sabor);
    }
    
}
