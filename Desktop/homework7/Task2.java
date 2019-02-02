package homework7;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>(); 
		ArrayList<Integer> len = new ArrayList<Integer>(); 
		int indexr = 0; 
		int lenmax = 0; 
		String setalon = new String();
		Scanner sin = new Scanner(System.in);
		System.out.println("Введите n строк");
		do {
			System.out.print("Введите строку символов: ");
			setalon = sin.nextLine();
			list.add(setalon);
			len.add(setalon.length());
			
			
		} while (setalon.length() > 0); 
		System.out.println();
		System.out.println("Строки по убыванию: ");
		while (len.size() > 1) {
                                                    
			for (int i = 0; i < len.size(); i++) { 
				if (len.get(i) > lenmax) {
					lenmax = len.get(i); 
					indexr = i; 
				}
			}
			System.out.println(list.get(indexr)); 
			list.remove(indexr); 
			len.remove(indexr); 
			indexr = 0; 
			lenmax = len.get(0); 

		}

	}

}
