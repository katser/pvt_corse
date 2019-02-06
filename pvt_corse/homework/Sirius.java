package homework;

public class Sirius extends Star{
	
	private int temp;
	private int age;

	public Sirius() {

	}
	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void printTemp() {
		System.err.println("What's the temperature? " + temp);
	}

	public void printAge() {
		System.err.println("Age: " + age);
	}
	

}
