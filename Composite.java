import java.io.*;
import java.util.*;
class Composite
{
   static Scanner sc=new Scanner(System.in);
   public static void main(String[] args)
   {
     try
      {
        System.out.println("enter the starting number: ");
        int start=sc.nextInt();
        System.out.println("enter the ending number: ");
        int end=sc.nextInt();
        if(start<=0||end<=0)
        {
           System.out.println("enter the valid numbers!");
        }
        else if(start>end)
        {
           System.out.println("enter the value correctly!");
        }
        while(start<end)
        { 
           int c=0;
           int j=2;
           while(j<start)
           {
              if(start%j == 0)
              {
                  c++;
              }
             j++;
           }
           if(c>0)
           {
              System.out.println(start);
           }
          start++; 
        }
      } 
      catch(Exception e)
      {
            System.out.println("enter only numbers!");    
      }
   }
}
