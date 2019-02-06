package homework;

public class Star extends StarSystem{

	private int size;
	private int lightning;
	private String a = " ";

	public Star() {

	}

	public Star(int size) {
		super();
		this.size = size;
	}

	public Star(int size, int lightning) {
		super();
		this.size = size;
		this.lightning = lightning;
	}

	public void printSize() {
		System.out.println("Star's size: " + size);
	}

	public void printLightning() {
		System.out.println("Star's lightning: " + lightning);
	}

	@Override
	public void printAllInf() {
		System.out.println("Star's all info: " + super.getStSysAge() + a + super.getSStSysName());
		printSize();
		printLightning();
	}

	@Override
	public void printStSysInf() {
		System.err.println("Star System's info: " + super.getStSysAge() + a + super.getSStSysName());

	}
}
