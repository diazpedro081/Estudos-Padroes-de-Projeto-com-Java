package br.com.padroes.projeto.java.creationalPatterns.prototype.src.domain;

public class BikeDeCorrida extends Bike{
    
    public BikeDeCorrida() {
        tipo = Tipo.CORRIDA;
    }

    @Override
    public void criarBike() {
        System.out.println("Uma bike de corrida foi faturada");
    }
}
