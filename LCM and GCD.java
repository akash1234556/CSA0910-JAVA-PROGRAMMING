import java.io.*;
import java.util.*;
class LCMandGCD
{
   static int GCD(int a,int b)
   {
       while(b!=0)
       {
          int temp = b;
          b = a%b;
          a = temp;
       }
     return a;
   }
   static int LCM(int a,int b)
   {
      return(a*b)/GCD(a,b);
   }
   public static void main(String[]args)
   {
       int x,y;
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the x value: ");
       x=sc.nextInt();
       System.out.println("enter the y value: ");
       y=sc.nextInt();
       int gcd = GCD(x,y);
       int lcm = LCM(x,y);
       System.out.println("the gcd of "+x+" & "+y+" is : "+gcd);
       System.out.println("the lcm of "+x+" & "+y+" is : "+lcm);
    }
} 
