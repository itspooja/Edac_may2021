import java.util.Scanner;
public class quest22 {
 public static void main(String args[]) 
 {
  Scanner sc = new Scanner(System.in);
  long binaryNumber, decimalNumber = 0, base= 1, remainder;
  System.out.print("Input a binary number: ");
  binaryNumber = sc.nextLong();

  while (binaryNumber != 0) 
  {
   remainder = binaryNumber % 10;
   decimalNumber = decimalNumber + remainder * base;
   base=base * 2;
   binaryNumber = binaryNumber / 10;
  }
  System.out.println("Decimal Number: " + decimalNumber);
 }
}