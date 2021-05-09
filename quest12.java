import java.util.Scanner;
    
 class quest12
  {
    public static void main(String args[])
     {  
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter three nos:");
		int a=sc.nextInt();
		int b=sc.nextInt(); 
		int c=sc.nextInt(); 
		int sum=(a+b+c)/3;
		System.out.println("the average is:" +sum);
		
	}  
  }