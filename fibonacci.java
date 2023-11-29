import java.io.*;
import java.util.*;
class Fibonacci
{
   public static void main(String[]args)
   {
      int fib[] = new int[50];
      int n,i,sum=0,t1=0,t2=1,nextTerm;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the size of array : ");
      n=sc.nextInt();
      nextTerm=t1+t2;
      System.out.print("the fibonacci series till "+n+" terms are :"+t1+","+t2);
      fib[0]=t1;
      fib[1]=t2;
      for(i=2;i<=n;i++)
      {
         System.out.print(","+nextTerm);
         fib[i]=nextTerm;
         t1=t2;
         t2=nextTerm;
         nextTerm=t1+t2;
      }
      for(i=0;i<=n;i=i+2)
      {
          if(i%2==0)
          {
             sum+=fib[i];
          }
      }
      System.out.println("the even sum of fibonacci series till "+n+" terms is: "+sum);
   }
}
 
