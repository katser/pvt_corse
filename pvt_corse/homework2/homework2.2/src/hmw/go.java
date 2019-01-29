package hmw;

import java.util.Scanner;

public class go {
	private static Scanner in;

public static void main(String[] args){
	
	System.out.print("Введите размер массива: ");
	in = new Scanner(System.in);

	 int a = in.nextInt();
	int[] num = new int[a];
	for (int i = 0; i < num.length; i++) {
		int z = (int) Math.round(0 + Math.random() * 10);
		num[i] = z;
		System.out.print(num[i] + " "); }

	{System.out.println(" "); }

    
	int p=1;
	int i=0;
	while(i<num.length){
	p*=num[i];
	i++;
	}
	System.out.println(p);
}}