package hmw;

import java.util.Arrays; 
import java.util.Scanner; 


public class go { 
private static Scanner in; 

public static void main(String[] args) { 
System.out.print("Введите размер массива: "); 
in = new Scanner(System.in); 
int a = in.nextInt(); //кол элементов 

int[] num = new int[a]; 
{ 
for (int i = 0; i < num.length; i++) { 
int z = (int) Math.round(0 + Math.random() * 10); 
num[i] = z; 
} 
System.out.println(Arrays.toString(num)); 
} 
System.out.println(" "); 

int length = num.length; 
int tmp2; 
for (int i=1,tmp = num[0]; i<length-1; i++ ){ 
tmp2 = num[i]; 
num[i] = (tmp+num[i+1])/2; 
tmp = tmp2; 
} 

for (int i =0; i<length; i++) 
System.out.print(num[i] + " "); 



} 
}