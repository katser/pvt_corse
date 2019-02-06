package homework;

public class Planet extends StarSystem{

	private String WhoLiveOnPlanet;
	private int PlanetMass;
	private String a = " ";
	public Planet() {

	}

	public Planet(String whoLiveOnPlanet, int planetMass) {
		super();
		this.WhoLiveOnPlanet = whoLiveOnPlanet;
		this.PlanetMass = planetMass;
	}
	public void WhoLiveOnPlanet() {
		System.err.println("They are live on planet: " + WhoLiveOnPlanet);
	}

	public void PlanetMass() {
		System.err.println("Planet mass:" + PlanetMass);
		
	
	}
	

	@Override
	public void printAllInf() {
		System.out.println("All Info: " + super.getSStSysName() + a + super.getStSysAge() + a);
		WhoLiveOnPlanet();
		PlanetMass();
		
	}

	@Override
	public void printStSysInf() {
		System.out.println("Star System Info: " + super.getSStSysName() + a + super.getStSysAge());
		
	}
	
	
	
}
