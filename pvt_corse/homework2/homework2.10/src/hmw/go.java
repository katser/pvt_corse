package hmw;

import java.util.Arrays;
import java.util.Scanner;

public class go {
	private static Scanner in;

	public static void main(String[] args) { 
		System.out.print("Введите размер массива: "); 
		in = new Scanner(System.in); 
		int a = in.nextInt(); //кол элементов 

		int[] num = new int[a]; 
		{ 
		for (int i = 0; i < num.length; i++) { 
		int z = (int) Math.round(0 + Math.random() * 10); 
		num[i] = z; 
		
		System.out.print(num[i] + " ");
		}
		System.out.println(" ");
		int x = 0; 
		for (int i = 1; i < num.length; i++) { 
			if (num[i] > num[i-1]) x++;

			} 

			if (x==num.length-1) System.out.print(" Является"); 
			else System.out.print("Не является"); 


			} 


		

	

		} 
	}