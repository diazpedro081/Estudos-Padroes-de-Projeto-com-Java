package br.com.padroes.projeto.java.creationalPatterns.prototype.src.domain;

import java.util.Hashtable;

import br.com.padroes.projeto.java.creationalPatterns.prototype.src.domain.Bike.Marca;
import br.com.padroes.projeto.java.creationalPatterns.prototype.src.domain.Bike.Tipo;



public class CacheDePrototipos{

    private static Hashtable<Bike.Tipo, Bike> bikes = new Hashtable<Bike.Tipo, Bike>();

    public static Bike getBikeClonada(Bike.Tipo tipo){
        Bike retorno = bikes.get(tipo);
        return (Bike) retorno.clone();
    }

    public static void criar() {

        Bike bikeDeCorrida = new BikeDeCorrida();
        bikeDeCorrida.setCodigo(669);
        bikeDeCorrida.setTipo(Tipo.CORRIDA);
        bikeDeCorrida.setMarca(Marca.CALOI);
        bikes.put(bikeDeCorrida.getTipo(), bikeDeCorrida);
        bikeDeCorrida.criarBike();

        Bike bikeDePasseio = new BikeDePasseio();
        bikeDePasseio.setCodigo(779);
        bikeDePasseio.setTipo(Tipo.PASSEIO);
        bikeDePasseio.setMarca(Marca.MONACO);
        bikes.put(bikeDePasseio.getTipo(), bikeDePasseio);
        bikeDePasseio.criarBike();

        Bike bikeDeTrilha = new BikeDeTrilha();
        bikeDeTrilha.setCodigo(889);
        bikeDeTrilha.setTipo(Tipo.TRILHA);
        bikeDeTrilha.setMarca(Marca.TSW);
        bikes.put(bikeDeTrilha.getTipo(), bikeDeTrilha);
        bikeDeTrilha.criarBike();
    }
    
}
