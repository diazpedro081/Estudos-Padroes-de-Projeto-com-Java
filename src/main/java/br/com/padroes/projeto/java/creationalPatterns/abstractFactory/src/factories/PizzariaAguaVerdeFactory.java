package br.com.padroes.projeto.java.creationalPatterns.abstractFactory.src.factories;

import br.com.padroes.projeto.java.creationalPatterns.abstractFactory.src.domain.Pizza;
import br.com.padroes.projeto.java.creationalPatterns.abstractFactory.src.domain.Pizzaria;
import br.com.padroes.projeto.java.creationalPatterns.abstractFactory.src.domain.PizzariaAguaVerde;
import br.com.padroes.projeto.java.creationalPatterns.abstractFactory.src.domain.Pizza.Sabor;

public class PizzariaAguaVerdeFactory extends PizzariaFactory {

    private Pizzaria pizzaria;

    public PizzariaAguaVerdeFactory() {
        this.pizzaria = new PizzariaAguaVerde();
    }

    @Override
    public Pizza pedirPizza(Sabor sabor) {
        return this.pizzaria.pedirPizza(sabor);
    }
}
