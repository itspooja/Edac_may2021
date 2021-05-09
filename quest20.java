class quest20
{
  public static void main(String args[])
   {
     int octal[]=new int[10];
     System.out.println("decimal to octal");
     int index=0;
     int n=16;
     while(n!=0)
     { 
       octal[index++]=n%8;
       n=n/8;
       
     }
      System.out.println(octal[index]);

       for(int i=index-1;i>=0;i--) 
       {
        System.out.println(octal[i]);
       }
        
   }
}