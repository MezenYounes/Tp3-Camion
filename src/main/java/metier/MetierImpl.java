package metier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetierImpl implements ImetierCatalogue {
@Override
public List<Camion> getCamionsParMotCle(String mc) {
List<Camion> prods= new ArrayList<Camion>();
Connection conn=SingletonConnection.getConnection();
try {

PreparedStatement ps= conn.prepareStatement("select * from CAMIONS where NOM_CAMION LIKE ?");

ps.setString(1, "%"+mc+"%");
ResultSet rs = ps.executeQuery();
while (rs.next()) {
	Camion p = new Camion();
p.setIdCamion(rs.getLong("ID_CAMION"));
p.setNomCamion(rs.getString("NOM_CAMION"));
p.setPrix(rs.getDouble("PRIX"));
prods.add(p);
}
} catch (SQLException e) {
e.printStackTrace();
}
return prods;
}
@Override
public void addProduit(Camion p) {
// TODO Auto-generated method stub
}
}
