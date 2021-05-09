import java.util.Scanner;
    
 class quest13
  {
    public static void main(String args[])
     {  
        Scanner sc = new Scanner(System.in);
		
        double W =sc.nextDouble();
		double H =sc.nextDouble(); 
		double area=W*H;
		System.out.println("area of rectangle:" +area);
		
		double perimeter=2*(W+H);
		System.out.println("perimeter of the rectangle:" +perimeter);
	 }
 }  