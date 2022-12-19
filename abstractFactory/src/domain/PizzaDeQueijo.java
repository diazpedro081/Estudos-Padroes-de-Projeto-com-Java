package domain;

public class PizzaDeQueijo extends Pizza{
    
    public PizzaDeQueijo() {
        nome = "Pizza de Queijo";
        massa = "Massa normal";
        molho = "Molho Marinara";
        coberturas.add("Mussarela fresca");
        coberturas.add("Parmesão");
    }
}
