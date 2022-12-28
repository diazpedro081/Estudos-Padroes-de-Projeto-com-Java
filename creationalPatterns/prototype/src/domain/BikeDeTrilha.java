package domain;

public class BikeDeTrilha extends Bike{

    public BikeDeTrilha() {
        tipo = Tipo.TRILHA;
    }

    @Override
    public void criarBike() {
        System.out.println("Uma bike de Trilha foi faturada");
        
    }
    
}
