package homework;

public class Mars extends Planet {
	private Boolean isItAPlanet;
	private int population;

	
	public Mars() {

	}
	
	public void printIsItAPlanet() {
		System.err.println("Does Mars a planet? " + isItAPlanet);
	}

	public void printPopulation() {
		System.err.println("how many martians? " + population);
	}

	@Override
	public String toString() {
		return "Mars [isItAPlanet=" + isItAPlanet + ", population=" + population + "]";
	}
	
	
}
