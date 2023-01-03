package br.com.padroes.projeto.java.creationalPatterns.factoryMethod.src.pattern.factory;

import br.com.padroes.projeto.java.creationalPatterns.factoryMethod.src.pattern.domain.Pet;

public interface Factory {
    
    public Pet criarPet(String tipoDoAnimal);
    
}
