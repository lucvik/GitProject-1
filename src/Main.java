import java.sql.SQLException;

public class Main {

	/**
	 * @param args
	 * @throws SQLException
	 */
	public static void main(String[] args) throws SQLException {
		SpaceShip atlantis = SpaceShipFactory.getSpaceShip(2);

		System.out.println("Spacestation 2.0");
		System.out.println("==== ==== ==== ==== ====");
		System.out.println("Hello " + atlantis);

	}

}
