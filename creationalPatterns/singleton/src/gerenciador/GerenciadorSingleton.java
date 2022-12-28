package gerenciador;

import java.util.ArrayList;
import java.util.List;

import domain.Usuario;

public class GerenciadorSingleton {
    
    private static GerenciadorSingleton instancia;

    private List<Usuario> usuarios;

    private GerenciadorSingleton() {

        usuarios = new ArrayList<Usuario>();
        usuarios.add(new Usuario("LoginUm", "******"));
        usuarios.add(new Usuario("LoginDois", "******"));
    }

    public static GerenciadorSingleton getInstancia() {
        if(instancia == null) {
            synchronized (GerenciadorSingleton.class) {
                if (instancia == null) {
                    instancia = new GerenciadorSingleton();
                }
            }
        }
        return instancia;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
}
