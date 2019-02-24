package homework16;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.naming.NamingException;

public class Massive {
	public int Min(int[] a) {
		int b = a[0];
		for (int i = 0; i < a.length; i++) {
			if (b > a[i])
				b = a[i];
		}
		return b;
	}

	public int remove(int[] a, int x) {
		Arrays.asList(a).remove(x);
		return a[x];

	}

	public int Sum(int[] a) {
		int b = 0;
		for (int i = 0; i < a.length; i++) {
			b = b + a[i];
		}
		return b;

	}

	public boolean contains(int[] a, Object c) throws Exception {
		boolean b = Arrays.asList(a).contains(c);
		return b;

	}

	public int[] Div(int[] a) {
		for (int i = 0; i < a.length; i++) {

			a[i] = a[i] / i;
		}
		return a;
	}

	public boolean equals(int[] a, int[] b) {
		return a.equals(b);

	}

	public int Multi(int[] a) {
		int b = 1;
		for (int i = 0; i < a.length; i++) {
			b = b * a[i];
		}
		return b;
	}

	public int Div(int[] a, int c) throws NamingException {
		return Arrays.asList(a).size() / c;

	}

	public int[] Writ(int[] a, int c) {
		a = new int[c];
		for (int i = 0; i < c; i++) {
			a[i] = i;
		}
		return a;
	}

	public int[] Revers(int[] a) {
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i]);
		}
		return a;
	}

}