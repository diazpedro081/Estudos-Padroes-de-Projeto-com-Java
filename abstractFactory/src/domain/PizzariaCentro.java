package domain;

import domain.Pizza.Sabor;

public class PizzariaCentro extends Pizzaria{

    @Override
    Pizza produzirPizza(Sabor sabor) {
        if (sabor.equals(Pizza.Sabor.QUEIJO)) {
            return new PizzaDeQueijo();
        } else if (sabor.equals(Pizza.Sabor.VEGANA)) {
            return new PizzaVegana();
        } else if (sabor.equals(Pizza.Sabor.CALABRESA)) {
            return new PizzaDeCalabrezaCentro();
        } else if (sabor.equals(Pizza.Sabor.PEPPERONI)) {
            return new PizzaDePepperoni();
        } else return null;
    }
}