package hmw;

public class go {
	public static void main(String[] args) {
		int a = (int) Math.round(0 + Math.random() * 10);
		System.out.print(a);
		System.out.println();
		System.out.print(squareX2(a));

	}

	static int squareX2(int a) {
		int result = square(a) * a;
		return result;
	}

	static int square(int a) {
		int result = a * a;
		return result;
	}

}
