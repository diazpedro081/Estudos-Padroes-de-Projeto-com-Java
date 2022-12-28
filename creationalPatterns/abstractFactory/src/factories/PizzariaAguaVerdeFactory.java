package factories;

import domain.Pizza;
import domain.Pizza.Sabor;
import domain.Pizzaria;
import domain.PizzariaAguaVerde;

public class PizzariaAguaVerdeFactory extends PizzariaFactory{
    
    private Pizzaria pizzaria;

    public PizzariaAguaVerdeFactory() {
        this.pizzaria = new PizzariaAguaVerde();
    }

    @Override
    public Pizza pedirPizza(Sabor sabor) {
        return this.pizzaria.pedirPizza(sabor);
    }

    

}
