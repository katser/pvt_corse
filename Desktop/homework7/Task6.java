package homework7;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {

		int n; 
		String text;
		Scanner scan = new Scanner(System.in);
		{
			if (scan.hasNextInt()) {
				n = Integer.parseInt(scan.nextLine());
				text = scan.nextLine();
				int wordCount = 0;
				for (String word : text.split(" ", n)) {
					int count = 0;
					for (int i = 1; i < word.length(); i++) {
						if (word.toCharArray()[i] > word.toCharArray()[i - 1]) {
							count++;
						}
					}
					if ((word.length() - 1 == count) && (word.length() > 1) && (wordCount == 0)) {
						System.out.println(word);
						wordCount++;
					}

				}
				if (wordCount == 0)
					System.out.println("NOT FOUND");
			}

		}
	}
}
