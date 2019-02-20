package homework;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.naming.NamingException;

public class Massive {

	private int[] a;
	private int[] d;

	public int remove(int[] a, int x) {
		Arrays.asList(a).remove(x);
		return a[x];

	}

	public boolean contains(int[] a, Object c) throws Exception {
		boolean b = Arrays.asList(a).contains(c);
		return b;
	}

	public boolean isEmpty(int[] a, int c) {
		boolean b = Arrays.asList(a).isEmpty();
		return b;

	}

	public boolean equals(int[] a, int[] b) {
		return a.equals(b);

	}

	public int Div(int[] a, int c) throws NamingException {
		return Arrays.asList(a).size() / c;

	}

	
}
