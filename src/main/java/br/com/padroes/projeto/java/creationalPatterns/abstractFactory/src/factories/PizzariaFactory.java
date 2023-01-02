package br.com.padroes.projeto.java.creationalPatterns.abstractFactory.src.factories;

import br.com.padroes.projeto.java.creationalPatterns.abstractFactory.src.domain.Pizzaria.Localidade;

public abstract class PizzariaFactory implements AbstractFactory{

    public static AbstractFactory getFactorory(Localidade localidade) {

        AbstractFactory factory;
        if (localidade.equals(Localidade.CENTRO)){
            factory = new PizzariaCentroFactory();
        } else {
            factory = new PizzariaAguaVerdeFactory();
        }
        return factory;
    }
}
