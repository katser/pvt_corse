package homework7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task4 {

	public static void main(String[] args) {
		
		int n; 
        String[] words;
        String text;
        Scanner scan = new Scanner (System.in);
        if (scan.hasNextInt ()) {
            n = Integer.parseInt (scan.nextLine ());
            text = scan.nextLine ();
            words = text.split (" ", n);

            String wordMinCharVar = words[0];
            int sizeMinCharVar = new HashSet<String> (Arrays.asList (words[0].split (""))).size ();


            for (String word :
                    words) {
                Set<String> set = new HashSet<String> (Arrays.asList (word.split ("")));
                if (set.size () < sizeMinCharVar) {
                    
                    wordMinCharVar = word;
                    sizeMinCharVar = set.size ();
                    System.out.println("Слово - " + word);
                }
            }
            System.out.println (wordMinCharVar);
        }


}
}