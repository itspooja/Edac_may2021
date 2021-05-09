import java.util.*;
public class quest24 {
public static void main(String[] args) 
    {
        int binary,rem, decnum=0, quot, base=1,j;
        int octnum[] = new int[100];
        Scanner scan = new Scanner(System.in);
		System.out.print("Input a Binary Number : ");
        binary = scan.nextInt();
       
     
      while(binary > 0)
        {
            rem = binary % 10;
            decnum = decnum + rem*base;
            //System.out.println(rem);
            base = base*2;
            binary = binary/10;
        }   

		base=1;
        quot = decnum;
		
        while(quot > 0)
        {
            octnum[base++] = quot % 8;
            quot = quot / 8;
        }
		
        System.out.print("Equivalent Octal Value of binary is :");
        for(j=base-1; j>0; j--)
        {
            System.out.print(octnum[j]);
        }
        System.out.println();
     }
   }