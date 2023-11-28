import java.io.*;
import java.util.*;
class reverse
{
   public static void main(String[]args)
   {
       String a,b="";
       int i,d;
       Scanner sc = new Scanner(System.in);
       System.out.println(" enter the original word: ");
       a=sc.next();
       d=a.length();
       for(i=d-1;i>=0;i--)
       {
            b=b+a.charAt(i);
       }
       System.out.println("the reversed word is : "+b);
   }
}
