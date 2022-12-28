import domain.Pizza;
import domain.Pizza.Sabor;
import factories.AbstractFactory;
import factories.PizzariaAguaVerdeFactory;

public class AppPizzaria {
    public static void main(String[] args) {
        AbstractFactory factory = new PizzariaAguaVerdeFactory();
        Pizza pizza = factory.pedirPizza(Sabor.CALABRESA);

        System.out.println(pizza);
    }
}
