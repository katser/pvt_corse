package homework;

public class Hmw9 {
	
	public static void main(String[] args) {
		Sirius sirius = new Sirius();
		Sun sun = new Sun(22, 5, true, "red");
		Star star = new Star(70, 80);
		Planet planet = new Planet("nobody", 30);
		Mars mars = new Mars();
		StarSystem earth = new Earth();

		sirius.setTemp(56);
		sirius.setAge(20);
		sirius.setStSysAge(30);
		sirius.setStSysName("*some system name*");

		sirius.printTemp();
		sirius.printAge();

		star.setStSysAge(5);
		star.setStSysName("Borkland");
		star.printAllInf();
		star.printStSysInf();

		sun.printAllInf();

		planet.setStSysAge(500);
		planet.setStSysName("Miauland");
		planet.printAllInf();
		planet.printStSysInf();
		
		
		mars.WhoLiveOnPlanet();
		mars.PlanetMass();
		


}
}
