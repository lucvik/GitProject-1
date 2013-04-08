import java.sql.SQLException;
import java.util.List;

public class Main {

	/**
	 * @param args
	 * @throws SQLException
	 */
	public static void main(String[] args) throws SQLException {
		List<SpaceShip> spaceships = SpaceShipFactory.getAllSpaceShips();
		SpaceShip atlantis = spaceships.get(0);
		
		System.out.println("Spacestation 3.0");
		System.out.println("==== ==== ==== ==== ====");
		System.out.println("Hello " + atlantis);

	}

}
