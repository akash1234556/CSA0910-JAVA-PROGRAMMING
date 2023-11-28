import java.io.*;
import java.util.*;
class reverseNumber
{
   public static void main(String[]args)
   {
      int n,re=0,rem;
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the number: ");
      n=sc.nextInt();
      while(n!=0)
      {
         rem=n%10;
         re=re*10+rem;
         n=n/10;
      }
      System.out.println("the reversed number is : "+re);
   }
}
