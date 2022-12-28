import domain.Usuario;
import gerenciador.GerenciadorSingleton;

public class AppGerenciador {
    public static void main(String[] args) {
        
        GerenciadorSingleton gerenciador = GerenciadorSingleton.getInstancia();
        
        for (Usuario usuario : gerenciador.getUsuarios()) {
            System.out.println("Login: " + usuario.getLogin());
            System.out.println("senha: " + usuario.getSenha());
            
            usuario.setLogin(usuario.getLogin().toUpperCase());
        }
        
        GerenciadorSingleton segundoGerenciador = GerenciadorSingleton.getInstancia();
        
        for (Usuario usuario : segundoGerenciador.getUsuarios()) {
            System.out.println("Login: " + usuario.getLogin());
            System.out.println("senha: " + usuario.getSenha());
            
            usuario.setLogin(usuario.getLogin().toUpperCase());
        }
    }
}
