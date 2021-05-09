import java.util.Scanner;
public class quest23 {
 public static void main(String[] args) 
 {
  int[] hex = new int[100];
  int base=1, j=0, rem, dec=0, bin;
  Scanner input = new Scanner(System.in);
  System.out.print("Input a Binary Number: ");
  bin = input.nextInt();
  while (bin > 0) {
   rem = bin % 2;
   dec = dec + rem * base;
   base = base*2;
   bin = bin / 10;
  }
   base= 0;
  while (dec!= 0) {
   hex[base++] = dec%16;
   dec= dec/16;
  }
  System.out.print("HexaDecimal value: ");
  for (j = base-1; j >= 0; j--)
  {
   if (hex[j] > 9) 
   {
    System.out.print((char)(hex[j] + 55));
   } else
   {
    System.out.println(hex[j]);
   }
  }
 }
}