class quest19
{
  public static void main(String args[])
   {
     int binary[]=new int[20];
     System.out.println("decimal to binary");
     int index=0;
     int n=19;
     while(n!=0)
     { 
       binary[index++]=n%2;
       n=n/2;
       
     }
      System.out.println(binary[index]);

       for(int i=index-1;i>=0;i--) 
       {
        System.out.println(binary[i]);
       }
        
   }
}