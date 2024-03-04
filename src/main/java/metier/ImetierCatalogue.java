package metier;
import java.util.List;
public interface ImetierCatalogue {
public List<Camion> getCamionsParMotCle(String mc);
public void addProduit(Camion p);
}