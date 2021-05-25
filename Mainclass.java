/*1)WAP to demonstrate (2.45pm to 3.30)
a)class, object
b)array of object
c)different method
d)constructor
e)constructor /method overloading
f)static variable, method */

//import java.util.*;
class Students{     

   String name;
   int id;
   float marks;
   //////////////////////// parametarized constructor////////////
   Students(String n,int i,float m){      
   name=n;
   id=i;
   marks=m;
   }  
   ////////////////////Method overloading//////////////////
  void showData(){
  
     System.out.println("Student name is\n"+name+"\n"+"Student ID is\n"+id+"\n"+"Semister Marks\n"+marks);
     }
  int subMarks(int s1,int s2) 
  {
	  System.out.println("Total marks obtained in two subjects are");
	  return s1+s2;
  }
  float subMarks(int s1,int s2,float s3) {
	  System.out.println("Total marks obtained in three subjects are");
	  return s1+s2+s3;
  }
  ///////////////////////array of object/////////////////
                  
}

public class Mainclass{
	static String password ="allinone@123";
   public static void main(String[] args){
     
	Students obj=new Students("Pooja",12,456f);
	  obj.showData();
	  obj.subMarks(45, 75, 68);
	  System.out.println("Student's password is\n"+Mainclass.password);
      System.out.println("************************");
      // Students[] s=new Students[2];
       // Scanner sc=new Scanner(System.in);
      //  for(int i=0;i<=2;i++) {
       //  s[i]=sc.nextInt(); 
        }
   }
