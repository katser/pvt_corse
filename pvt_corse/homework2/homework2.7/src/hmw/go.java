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
		} 
		System.out.println(Arrays.toString(num)); 
		} 
		System.out.println(" "); 
		int k; 
		int length = num.length; 
		for (int i=0; i < length/2; i++) 
		{ 
		k = num[i]; 
		num[i] = num [length -1-i]; 
		num [length -1-i] = k; 
		} 
		for (int i =0; i<length; i++) 
		System.out.print(num[i] + " "); 

	

		} 
		}