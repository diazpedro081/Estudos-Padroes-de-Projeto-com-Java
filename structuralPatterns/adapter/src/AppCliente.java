import domain.JSON;
import domain.JsonImpl;
import domain.XML;
import domain.XmlImpl;
import service.ConteudoService;

public class AppCliente {
    public static void main(String[] args) {
        
        ConteudoService service = new ConteudoService();

        JSON json = new JsonImpl();
        XML xml = new XmlImpl();
        //XMLAdapter adapter = new XMLAdapter(xml);

        System.out.println(xml);
        System.out.println();

        service.set(json);
        System.out.println(service.get());
        System.out.println();
    }
}
