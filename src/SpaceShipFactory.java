import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SpaceShipFactory {
	static SpaceShip getSpaceShip(int id) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		String url = "jdbc:mysql://localhost:3306/spaceship";
		String user = "root";
		String password = "";

		try {
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM spaceship WHERE id=" + id);

			if (rs.next()) {
				SpaceShip spaceShip = new SpaceShip();
				spaceShip.setName(rs.getString("name"));
				spaceShip.setWeight(rs.getDouble("weight"));

				return spaceShip;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
	
	static List<SpaceShip> getAllSpaceShips() {
		List<SpaceShip> ret = new ArrayList<SpaceShip>();
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		String url = "jdbc:mysql://localhost:3306/spaceship";
		String user = "root";
		String password = "";

		try {
			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM spaceship");

			while (rs.next()) {
				SpaceShip spaceShip = new SpaceShip();
				spaceShip.setName(rs.getString("name"));
				spaceShip.setWeight(rs.getDouble("weight"));

				ret.add(spaceShip);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return ret;
	}
}
