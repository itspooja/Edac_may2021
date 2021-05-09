import java.util.Scanner;
    
 class quest15
  {
    public static void main(String args[])
     {  
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter two nos:");
		int a=sc.nextInt();
		int b=sc.nextInt(); 
		System.out.println( a+ " " +b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping");
		System.out.println(a+ " " +b);
		
     }  
  }