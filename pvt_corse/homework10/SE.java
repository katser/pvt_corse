package homework10;

import java.util.Scanner;

public class SE {

	public static void main(String[] args) {
		
		Text.TextInput();
		Scanner scan = new Scanner(System.in);
		String l = Messages.getString("8"); 
		String t = Messages.getString("9"); 
		while (true) {
			l= scan.nextLine();
			if (Messages.getString("10").equals(l)) { 
				break;
			}
			t = l + t;
		}
		System.err.println(Messages.getString("11")); 
		int symbol = scan.nextInt();
		
		System.err.println(Messages.getString("12")); 
	
		Text.Fin(t, symbol);
		
	
	}

	public SE() {
		super();
	}

}