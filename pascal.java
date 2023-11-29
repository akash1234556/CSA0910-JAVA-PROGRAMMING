import java.io.*;
import java.util.*;
class pascal
{
  public static void main(String[]args)
  {
      int rows;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the no. of rows: ");
      rows=sc.nextInt();
       for(int i=0;i<rows;i++)
       {
          int number=1;
          for(int j=0;j<rows-i;j++)
          {
            System.out.print(" ");
          }
          for(int k=0;k<=i;k++)
          {
            System.out.print(" ");
            System.out.printf("%3d",number);
            number=number*(i-k)/(k+1);
          }
          System.out.println();
       }
   }
}
