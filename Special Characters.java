import java.io.*;
import java.util.*;
class SpecialCharacter
{
   public static void main(String[]args)
   {
      String s1;
      int a_count=0,s_count=0,n_count=0,len;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the string : ");
      s1=sc.next();
      len=s1.length();
      char[] ch=s1.toCharArray();
      for(int i=0;i<len;i++)
      {
         if(Character.isDigit(ch[i]))
         {
             n_count++;
         }
         else if(ch[i]>='a' && ch[i]<='z' || ch[i]>='A'&&ch[i]<='Z')
         {
             a_count++;
         }
         else
         {
            System.out.print(ch[i]);
            s_count++;
         }
      }
      System.out.println();
      System.out.println("total special characters are: "+s_count++);
   }
}
