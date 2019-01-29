package hmw;

import java.util.Scanner;

public class go {
	private static Scanner in;

	public static void main(String[] args) {
		System.out.print("Введите размер массива: ");
		in = new Scanner(System.in);
int x = 0;
		 int a = in.nextInt();
		int[] num = new int[a];
		{for (int i = 0; i < num.length; i++) {
			int z = (int) Math.round(0 + Math.random() * 10);
			num[i] = z;
			if (z == 0) x++;}
			 
if (x!=0) System.out.print(x);
else System.out.print("Нулей нет");

		
			}
		
	

}}
