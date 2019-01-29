package hmw;

public class go {
	public static void main(String[] args) {
		int a = (int) Math.round(0 + Math.random() * 10);
		System.out.print(a);
		System.out.println();
		System.out.print(square(a));

	}

	static int square(int a) {
		int result = a * a;
		return result;
	}

}
