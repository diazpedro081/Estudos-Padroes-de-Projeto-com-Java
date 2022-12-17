package domain;

import java.util.ArrayList;
import java.util.List;

abstract public class Pizza {
    
    public static enum Sabor {
        CALABRESA,
        PEPPERONI,
        QUEIJO,
        VEGANA
    }

    String nome;
    String massa;
    String molho;
    List<String> cobertura = new ArrayList<String>();

    public String getNome() {
        return nome;
    }
    
    public void preparar() {
        System.out.println("Preparando " + nome);
    }

    public void assar() {
        System.out.println("Assando " + nome);
    }

    public void cortar() {
        System.out.println("Cortando " + nome);
    }

    public void embalar() {
        System.out.println("EMbalando " + nome);
    }

    @Override
    public String toString() {
        return "A Pizza de " + nome + ", massa=" + massa + ", molho=" + molho + ", cobertura=" + cobertura + "]";
    }

}
 