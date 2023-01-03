package br.com.padroes.projeto.java.creationalPatterns.factoryMethod.src.pattern.factory;

import br.com.padroes.projeto.java.creationalPatterns.factoryMethod.src.pattern.domain.Cachorro;
import br.com.padroes.projeto.java.creationalPatterns.factoryMethod.src.pattern.domain.Gato;
import br.com.padroes.projeto.java.creationalPatterns.factoryMethod.src.pattern.domain.Pet;

public class PetFactory implements Factory{
    
    public Pet criarPet(String tipoDoAnimal){
        
        switch(tipoDoAnimal.toLowerCase()){
            case "cachorro":
                return new Cachorro();
            case "gato":
                return new Gato();
            default:
                throw new UnsupportedOperationException("Animal desconhecido");
        }
    }
}
