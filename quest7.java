import java.util.Scanner;
    
 class quest7
  {
    public static void main(String args[])
     {  
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no:");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		
		{
		int a=(n*i);
		System.out.println("table is:" +a);
		
		}
	 }  
  }