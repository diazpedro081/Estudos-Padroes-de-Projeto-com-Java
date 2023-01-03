package br.com.padroes.projeto.java.creationalPatterns.factoryMethod.src.pattern.domain;

public interface Pet {
    
    String getNome();
    String getTipo();
    void setNome(String nome);
    boolean estaComFome();
    void comer();

}
