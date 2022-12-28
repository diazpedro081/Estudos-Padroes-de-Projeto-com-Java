package factories;

import domain.Pizzaria.Localidade;

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
