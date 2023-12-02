import java.io.*;
import java.util.*;
class rectangle
{
   public static void main(String[]args)
   {
      int n,m,i,j;
      Scanner sc= new Scanner(System.in);
      System.out.println("enter length : ");
      m=sc.nextInt();
      System.out.println("enter breadth : ");
      n=sc.nextInt();
      for(i=0;i<m;i++)
      {
          for(j=0;j<n;j++)
          {
                 System.out.print("*");
          }
          System.out.println();
      }
   }
}
