package homework13;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.stream.IntStream;

public class Massive {

	private int is;
	private String it;
	private int freedom;
	private  int a;
	

	public void DivZero() {
		
		
		try {					System.err.println(is/0);
		

			try {					System.err.println(is/0);

				try {
					System.err.println(is/0);
				} catch (Exception e) {
					System.out.println("и до этого");				}
			} catch (Exception e) {
				System.out.println("До этого уже не дойдет");			}
		} catch (ArithmeticException e) {
			System.out.println("Деление на ноль с try-catch с try внутри try");
		}
	}
	public void NolimitDivZer() {
		try {
			
			System.err.println(a/0);
			System.err.println(it.codePointAt(100));
			

		} catch (ArithmeticException e) {
			System.out.println("Деление на ноль c 2 catch");
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("Выход за предел" );
		}
	}
public void FileNotFoundDivZer() {
	
	PrintWriter pw; 
	
	
    try {  
        pw = new PrintWriter("jtp.txt"); 
        pw.println("saved"); 
		System.err.println(freedom/0);

    }  
catch (FileNotFoundException|ArithmeticException  e) {  
          
        System.out.println("Файл не найден с multi-catch");  
    }         
}
public void NullPoint() {
    String NullPoint = null;
    try {
		System.out.println(NullPoint.length());
	} catch (NullPointerException e) {
		System.out.println("Ошибка из-за нулевого стринга");
	}finally {
        System.out.println("try-catch-finally");
    }
}


public void setIs(int is) {
	this.is = is;
}
public void setIt(String it) {
	this.it = it;
}
public void setFreedom(int freedom) {
	this.freedom = freedom;
}
public void setOr(int a) {
	this.a = a;
}

	
	
	
	
}
