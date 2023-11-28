import java.io.*;
import java.util.*;
class User
{
   public static void main(String[]args)
   {
      String a,b;
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the Username: " );
      a=sc.next();
      System.out.println("Re-enter the Username: ");
      b=sc.next();
      if(a.equals(b))
      {
          System.out.println("Username Verified");
      }
      else
      {
           System.out.println("Invalid Username");
      }
   }
}
