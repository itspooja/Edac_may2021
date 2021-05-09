import java.util.Scanner;
    
 class quest17
  {
    public static void main(String args[])
     {  
        int i=0,carry=0;
        int a[]=new int[10];
        Scanner sc = new Scanner(System.in);
		System.out.println("Addition of binary");
		System.out.println("Enter two binary no:");
        int b1=sc.nextInt();
		int b2=sc.nextInt();
          while(b1!=0 || b2!=0)
           {
             a[i]=(int)((b1%10+b2%10+carry)%2);
             i++;
             carry=(int)((b1%10+b2%10+carry)/2);
             b1=b1/10;
             b2=b2/10;
           }
		  if(carry!=0) //carry==1
           {
            a[i++]=carry;
            //i++;
          }
         System.out.println("Sum of two binary no:");
          i--;
          while(i>=0)
          {
            System.out.print(a[i--]);
             //i--;
          }
         
	   }
		
  }