package br.com.padroes.projeto.java.creationalPatterns.abstractFactory.src.factories;

import br.com.padroes.projeto.java.creationalPatterns.abstractFactory.src.domain.Pizza;
import br.com.padroes.projeto.java.creationalPatterns.abstractFactory.src.domain.Pizza.Sabor;

public interface AbstractFactory {
    
    public Pizza pedirPizza(Sabor sabor);
}
