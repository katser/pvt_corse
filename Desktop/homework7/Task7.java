package homework7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task7 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		String text = scan.nextLine();
		String text2 = new HashSet<String>(Arrays.asList(text.split("\\s/,"))).toString();
		System.out.println(text2);
		LinkedHashSet<String> words = new LinkedHashSet<String>(n);
		boolean isThereAWord = false;
		for (String word : text.split(" ", n)) {
			int count = new HashSet<String>(Arrays.asList(word.split(""))).size() - 1;
			if (word.length() == count) {
				words.add(word);
				isThereAWord = true;
			}
		}

		if (isThereAWord) {
			for (int i = 0; i < words.size() - 1; i++) {
				System.out.print(words.toArray()[i] + " ");
			}
			System.out.println(words.toArray()[words.size() - 1]);
		} else {
			System.out.println("NOT FOUND");
		}

	}

}
