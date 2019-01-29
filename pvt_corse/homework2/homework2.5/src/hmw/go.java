package hmw;

import java.util.Scanner;

public class go {
	private static Scanner in;

	public static void main(String[] args) {
		System.out.print("Введите размер массива: ");
		in = new Scanner(System.in);
		 int a = in.nextInt();
		
		int x = 0;
		 int[] num = new int[a];
		{for (int i = 0; i < num.length; i++) {
			int z = (int) Math.round(0 + Math.random() * 10);
			num[i] = z;
			if (z == 0) x++;
			if (z == 0) System.out.print(i + " ");
			}
		System.out.println(" ");
			 
if (x==0) System.out.print("Нулей нет");


		
			}
		
	

}}
