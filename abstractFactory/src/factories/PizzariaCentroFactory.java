package factories;

import domain.Pizza;
import domain.Pizzaria;
import domain.PizzariaCentro;
import domain.Pizza.Sabor;

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
