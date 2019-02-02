package homework7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1 {

	public static void main(String[] args) {
		int n; 
		String[] text;
		Scanner scan = new Scanner(System.in);
		if (scan.hasNextInt()) { 
			n = Integer.parseInt(scan.nextLine());
			int indexMax = 0;
			int indexMin = 0;
			text = new String[n]; 

			for (int i = 0; i < n; i++) {
				text[i] = scan.nextLine();
				if (text[i].length() <= text[indexMin].length())
					indexMin = i;
				if (text[i].length() >= text[indexMax].length())
					indexMax = i;
			}

			System.out.printf("MIN (%d): \"%s\"%n", text[indexMin].length(), text[indexMin]);
			System.out.printf("MAX (%d): \"%s\"%n", text[indexMax].length(), text[indexMax]);
		}
	}
}
