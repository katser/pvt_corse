package task4_2;

import java.util.Arrays;

import task4_2.Massive;

public class Tester {
	public static void main(String[] args) {
		Massive massive = new Massive();
		int[] array = { 1, 2, 3, 4, 5 };

		massive.printMassiveAsLine(array);
		massive.printReverseMassiveAsLine(array);
		System.out.println();
		System.out.print(massive.getSumOfElements(array));
		System.out.println();
		System.out.print(Arrays.toString(massive.multiptyBy3(array)));
		System.out.println();
		massive.printMassiveAsLine(massive.multiptyBy3(array));
		System.out.println();
		massive.printReverseMassiveAsLine(massive.multiptyBy3(array));

	}
}