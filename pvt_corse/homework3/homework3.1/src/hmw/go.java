package hmw;

public class go {
	public static void main(String[] args) {
		int a = (int) Math.round(0 + Math.random() * 10);
		int b = (int) Math.round(0 + Math.random() * 10);
		System.out.print(a + " " + b);
		System.out.println();
		System.out.println(minNumberPrint(a, b));

	}

	static int minNumberPrint(int a, int b) {
		if (a > b) {
			return b;
		} else {
			return a;
		}
	}

}
