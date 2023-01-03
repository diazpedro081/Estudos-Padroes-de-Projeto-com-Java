package br.com.padroes.projeto.java.creationalPatterns.factoryMethod.src.pattern.domain;

public class Cachorro implements Pet {

    private String nome;
    private String tipo = "cachorro";
    private boolean estaComFome;

    public Cachorro() {
        super();
        this.estaComFome = true;
    }

    @Override
    public String getNome() {
        return nome;
    }
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }

    @Override
    public boolean estaComFome() {
        return estaComFome;
    }

    @Override
    public void comer() {
        if(estaComFome = true){
            System.out.println("Der comida a o Cachorro.");
        } else if(estaComFome = false) {
            System.out.println("Nao precisa dar comida, o Cachorro ja comeu.");
        }
    }

}
