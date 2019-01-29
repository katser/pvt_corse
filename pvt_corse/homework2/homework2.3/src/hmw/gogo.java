package hmw;

import java.util.Scanner;

public class gogo {
	private static Scanner in;

	public static void main(String[] args) {
		System.out.print("Введите размер массива: ");
		in = new Scanner(System.in);

		 int a = in.nextInt();
		int[] num = new int[a];
		for (int i = 0; i < num.length; i++) {
			int z = (int) Math.round(0 + Math.random() * 10);
			num[i] = z;
			System.out.print(num[i] + " "); }
			
		{System.out.println(" "); }

			
		for (int i = 2; i < num.length; i += 3)
		      num[i] *= 2;
		    for (int i = 0; i < num.length; i++)
		      System.out.format("%3d", num[i]);
			
		    {System.out.println(" "); }

		    for (int i = 0; i < num.length; i++)
		        if ((i+1)%3 == 0)
		          num[i] *= 2;
		      for (int i = 0; i < num.length; i++)
		        System.out.format("%3d", num[i]);
			}
	
		
	

}
