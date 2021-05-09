import java.util.Scanner;

class quest21
{
  public static void main(String args[])
   {
     int dec,rem;
     String hexadecimal="";
     System.out.println("decimal to hexadecimal");
     char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
     Scanner input=new Scanner(System.in);
     System.out.println("input a number");
     dec=input.nextInt();
     while(dec>0)
     { 
      rem=dec%16;
      hexadecimal=hex[rem] + hexadecimal;
       dec=dec/16;
      }
      System.out.println( hexadecimal);
    }
}