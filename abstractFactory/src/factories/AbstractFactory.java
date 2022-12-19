package factories;

import domain.Pizza;
import domain.Pizza.Sabor;

public interface AbstractFactory {
    
    public Pizza pedirPizza(Sabor sabor);
}
