package br.com.padroes.projeto.java.creationalPatterns.builder.src.domain;

public class Vendedor {
    
    private int codigo;
    private String nome;

    public Vendedor() {
    }

    public Vendedor(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return  nome + " \nCodgio Vendedor: " + codigo;
    }
}
