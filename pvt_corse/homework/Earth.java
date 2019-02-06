package homework;

public class Earth extends Planet{

	private int waterPercentage;
	private int airPercentage;

	public Earth() {

	}
	public int getWaterPercentage() {
		return waterPercentage;
	}

	public void setWaterPercentage(int waterPercentage) {
		this.waterPercentage = waterPercentage;
	}

	public int getAirPercentage() {
		return airPercentage;
	}

	public void setAirPercentage(int airPercentage) {
		this.airPercentage = airPercentage;
	}
	
	public void printWaterPercentage() {
		System.out.println("Water percentage = " + waterPercentage + "%");
	}

	public void printAirPercentage() {
		System.out.println("Air Percentage = " + airPercentage + "%");
	}

	

	
}
