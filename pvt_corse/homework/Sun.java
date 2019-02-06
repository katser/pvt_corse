package homework;

public class Sun extends Star{

	
	private boolean isItBig;
	private String color;
	
	public Sun() {

	}

	public Sun(int size, int lightning) {
		super(size, lightning);
	}

	public Sun(int size, int lightning, boolean isItBig) {
		this(size, lightning);
		this.isItBig = isItBig;
	}

	public Sun(int size, int lightning, boolean isItBig, String color) {
		this(size, lightning, isItBig);
		this.color = color;
	}

	public void printIsItBig() {
		System.out.println("is It Big?: " + isItBig);
	}

	public void printColour() {
		System.out.println("What the color of Sun?: " + color);
	}
}
