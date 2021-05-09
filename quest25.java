import java.util.Scanner;

public class quest25 {
 
public static void main(String args[]) 
   {
     Scanner input = new Scanner(System.in);
     long octal, decimal = 0;
     int i = 0;
     System.out.print("Input octal number: ");
     octal = input.nextLong();
    while (octal!= 0) 
     {
      decimal= (long)(decimal + (octal % 10) * Math.pow(8, i++));
      octal = octal/ 10;
     }
     System.out.print("Equivalent decimal number: " + decimal);
   }
}