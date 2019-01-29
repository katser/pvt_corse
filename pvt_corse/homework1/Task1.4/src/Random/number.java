
package Random;
import java.util.Random;
public class number
{
public static void main(String[] args)
{
Random generator = new Random();
int rnd = generator.nextInt(1000000);
System.out.println("Random number = " +rnd); 
}}