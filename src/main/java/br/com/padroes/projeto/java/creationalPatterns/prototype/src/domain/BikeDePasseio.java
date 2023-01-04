package br.com.padroes.projeto.java.creationalPatterns.prototype.src.domain;

public class BikeDePasseio extends Bike{

    public BikeDePasseio() {
        tipo = Tipo.PASSEIO;
    }

    @Override
    public void criarBike() {
        System.out.println("Uma bike de passeio foi faturada");
    }
    
}
