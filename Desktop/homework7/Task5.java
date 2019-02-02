package homework7;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

	int n; 
	int numWordsWithEqualLetters = 0;
	String text;
	Scanner scan = new Scanner(System.in);
	{
		if (scan.hasNextInt()) {
			n = Integer.parseInt(scan.nextLine());
			text = scan.nextLine();
			for (String nowWord : text.split(" ", n)) { 
				int countEngLetters = 0;
				int balance = 0;
				for (Character letter : nowWord.toCharArray() 
				) {
			
					if (((letter >= 'A') && (letter <= 'Z')) || ((letter >= 'a') && (letter <= 'z'))) {
						countEngLetters++;
						if ((letter == 'A') || (letter == 'E') || (letter == 'I') || (letter == 'O') || (letter == 'U')
								|| (letter == 'Y') || (letter == 'a') || (letter == 'e') || (letter == 'i')
								|| (letter == 'o') || (letter == 'u') || (letter == 'y'))
							++balance;
						else
							--balance;
					}
				}
				if (countEngLetters == nowWord.length()) { 
					if (balance == 0) {
						++numWordsWithEqualLetters;
					}
				}

			}
			System.out.println(numWordsWithEqualLetters);
		}
	}
}
}
