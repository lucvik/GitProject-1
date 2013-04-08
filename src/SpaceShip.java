public class SpaceShip {
	private String name;
	private Double weight;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SpaceShip [name=" + name + ", weight=" + weight + "]";
	}

	/**
	 * @return the name of the spaceship
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            setting the spaceships name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the weight
	 */
	public Double getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(Double weight) {
		this.weight = weight;
	}
}
