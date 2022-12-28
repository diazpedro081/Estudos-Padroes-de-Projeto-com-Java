package domain;

public class BikeDeCorrida extends Bike{
    
    public BikeDeCorrida() {
        tipo = Tipo.CORRIDA;
    }

    @Override
    public void criarBike() {
        System.out.println("Uma bike de corrida foi faturada");
    }
}
