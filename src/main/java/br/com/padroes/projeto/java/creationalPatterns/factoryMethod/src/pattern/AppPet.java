package br.com.padroes.projeto.java.creationalPatterns.factoryMethod.src.pattern;

import br.com.padroes.projeto.java.creationalPatterns.factoryMethod.src.pattern.domain.Pet;
import br.com.padroes.projeto.java.creationalPatterns.factoryMethod.src.pattern.factory.Factory;
import br.com.padroes.projeto.java.creationalPatterns.factoryMethod.src.pattern.factory.PetFactory;

public class AppPet {
    
    public static void main(String[] args) {
        //Cria a fabrica
        Factory factory = new PetFactory();

        Pet pet = factory.criarPet("cachorro");
        pet.setNome("puff");
        pet.comer();

        System.out.println("Nome: " + pet.getNome());
        System.out.println("Tipo: " + pet.getTipo());
        System.out.println("Esta com fome? " + pet.estaComFome());

        //Verifica a classe concreta que esta sendo usada.
        System.out.println("Classe: " + pet.getClass().getCanonicalName());
    }
}
