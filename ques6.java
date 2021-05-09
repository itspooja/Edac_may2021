import java.util.Scanner;
    
 class ques6
  {
    public static void main(String args[])
     {  
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter two nos:");
		double i=sc.nextDouble();
		double j=sc.nextDouble();
		double add=i+j;
		double sub=i-j;
		double mul=i*j;
		double div=i/j;
		double mod=i%j;
		System.out.println("Addition is:" +add);
		System.out.println("subtraction is:" +sub);
		System.out.println("Multiplication is:" +mul);
		System.out.println("Division is:" +div);
		System.out.println("Modulus is:" +mod);
		
		
     }  
  }