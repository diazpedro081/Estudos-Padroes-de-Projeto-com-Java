import domain.Bike;
import domain.CacheDePrototipos;
import domain.Bike.Tipo;

public class AppBikeShop{
    
    public static void main(String[] args){
        
        CacheDePrototipos.criar();

        Bike bikeCorridaClonada = CacheDePrototipos.getBikeClonada(Tipo.CORRIDA);
        System.out.println(bikeCorridaClonada);
        System.out.println("-_-_-_-_-_-");
        Bike bikePasseioClonada = CacheDePrototipos.getBikeClonada(Tipo.PASSEIO);
        System.out.println(bikePasseioClonada);
        System.out.println("-_-_-_-_-_-");
        Bike bikeTrilhaClonada = CacheDePrototipos.getBikeClonada(Tipo.TRILHA);
        System.out.println(bikeTrilhaClonada);

    }
    
}
