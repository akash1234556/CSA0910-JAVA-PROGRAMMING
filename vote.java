import java.io.*;
import java.util.*;
class vote
{
   public static void main(String[] args)
   {
      int age,b;
      System.out.println("enter your age: ");
      Scanner sc=new Scanner(System.in);
      age=sc.nextInt();
      if(age>=18)
      {
           System.out.println("you are eligible to vote");
      }
      else
      {
         b=18-age;
         System.out.println("you still require "+b+" year(s) to vote");
      }
   } 
}
