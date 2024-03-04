package metier;
import java.util.List;
public class TestMetier {
public static void main(String[] args) {
MetierImpl metier= new MetierImpl();
List<Camion> prods = metier.getCamionsParMotCle("HP");
for (Camion p : prods)
System.out.println(p.getNomCamion());
}
}