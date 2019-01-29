package task4_2;

import java.util.Arrays;

public class Massive {

	public static int[] array;

	public void printMassiveAsLine(int[] array) {

		System.out.println(Arrays.toString(array));
	}

	public void printReverseMassiveAsLine(int[] array) {
		int b = array.length - 1;

		while (b >= 0) {
			System.out.print(array[b] + " ");
			b--;
		}
	}

	public int getSumOfElements(int[] array) {

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;

	}

	public int[] multiptyBy3(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * 3;

		}

		return array;
	}
	/*
	 * public static int printMassiveAsLine(int array, int size) {
	 * 
	 * 
	 * for (int i = 0; i < size; i++) { array[i] = ; } System.out.print (" "); for
	 * (int i = 0; i < size; i++) { System.out.print (" " + array[i]); }
	 * System.out.println(); } public static void printReverseMassiveAsLine() {
	 * Scanner input = new Scanner(System.in);
	 * System.out.println("Введите длину массива"); int size = input.nextInt(); int
	 * array[] = new int[size]; System.out.println("Заполните массив");
	 * 
	 * for (int i = 0; i < size; i++) { array[i] = input.nextInt(); }
	 * System.out.print (" "); for (int i = 0; i < size; i++) { }
	 * System.out.println();
	 * 
	 * int b = array.length - 1;
	 * 
	 * while ( b >= 0){ System.out.print(array[b] + " "); b--;
	 * 
	 * } public int getArray() { { return this.age; }
	 * 
	 * public void printAllInformation() {
	 * 
	 * String a = " "; System.out.print(name + a + surname + a + age + a + phone);
	 * 
	 * }
	 * 
	 * public void printName() { String a = " "; System.out.print(name + a +
	 * surname);
	 * 
	 * }
	 * 
	 * public boolean isAdult(int a) {
	 * 
	 * if (a > 18) { return true; } else { return false; } }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public void setSurname(String surname) { this.surname = surname; }
	 * 
	 * public void setAge(int age) { this.age = age; }
	 * 
	 * public void setPhone(int phone) { this.phone = phone; }
	 * 
	 * public String getName() { { return this.name; } }
	 * 
	 * public String getSurname() { { return this.surname; } }
	 * 
	 * public int getAge() { { return this.age; } }
	 * 
	 * public double getPhone() { { return this.phone; }
	 * 
	 * }
	 */
}
