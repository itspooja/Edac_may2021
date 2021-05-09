import java.util.Scanner;
    
 class quest11
  {
    public static void main(String args[])
     {  
        Scanner sc = new Scanner(System.in);
		
        double r=sc.nextDouble();
		double PI=sc.nextDouble(); 
		double area=PI*r*r;
		System.out.println("area of circle:" +area);
		
		double perimeter=2*PI*r;
		System.out.println("perimeter of the circle:" +perimeter);
		
	}  
  }