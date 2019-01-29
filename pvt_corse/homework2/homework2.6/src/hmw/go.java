package hmw;

import java.util.Arrays;
import java.util.Scanner;

public class go {
	private static Scanner in;

	public static void main(String[] args) {
		System.out.print("Введите размер массива: ");
		in = new Scanner(System.in);
		 int a = in.nextInt();
		
		
		 int[] num = new int[a];
		{for (int i = 0; i < num.length; i++) {
			int z = (int) Math.round(0 + Math.random() * 10);
			num[i] = z;}
        System.out.println(Arrays.toString(num));}
        System.out.println(" ");

        int tmp;
        for(int i = 0; i < (num.length - 1); i ++) {
           tmp = num[i];
           num[i] = num[i + 1];
           num[i + 1] = tmp;
           
        
                
		 System.out.print(num[i] + " ");
        }
            }
        
        

			 



		
			}
		
	


