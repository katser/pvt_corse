package homework7;
import java.util.InputMismatchException;
import java.util.Scanner;
 
public class Task3 {
 
    public static void main(String[] args) {
        
    	 int n; 
         Scanner scan = new Scanner (System.in);
         if (scan.hasNextInt ()) {
             n = Integer.parseInt (scan.nextLine ());
             int average = 0;
             String[] text = new String[n];
             for (int i = 0; i < n; i++) {
                 text[i] = scan.nextLine ();
                 average += text[i].length ();
             }
             average = average / n;

             System.out.printf ("AVERAGE (%d)\n", average);
             for (int i = 0; i < n; i++) {
                 if (text[i].length () < average)
                     System.out.println ("(" + text[i].length () + "): \"" + text[i] + "\"");
             }
         }
     }
 
}


