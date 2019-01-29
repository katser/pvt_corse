package hmw;

import java.util.Scanner;

public class go {
	private static Scanner in;

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Введите длину массива");
	    int size = input.nextInt();
	    int array[] = new int[size]; 
	    System.out.println("Заполните массив");
	 
	    for (int i = 0; i < size; i++) {
	        array[i] = input.nextInt(); 
	    }
	    System.out.print (" ");
	    for (int i = 0; i < size; i++) {
	        System.out.print (" " + array[i]); 
	    }
	    System.out.println();
	
	    int b = array.length - 1;

	    while ( b >= 0){
	    	System.out.print(array[b] + " ");
	    b--;
	    }
			// for (int b = array.length - 1; b >= 0; b--) 
				
			
			//System.out.print(array[b] + " ");
			}
		
	

}
