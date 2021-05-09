import java.util.Scanner;
    
 class product
  {
    public static void main(String args[])
     {  
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter two nos:");
		int i=sc.nextInt();
		int j=sc.nextInt();
		int mul=i*j;
		System.out.println("Multiplication is:" +mul);
		
     }  
  }