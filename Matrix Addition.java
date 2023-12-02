import java.io.*;
import java.util.*;
class matrixAddition
{
   public static void main(String[]args)
   {
       int i,j,m,n;
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number of rows: ");
       m=sc.nextInt();
       System.out.println("enter the number of columns: ");
       n=sc.nextInt();
       int mat1[][] = new int[m][n];
       int mat2[][] = new int[m][n];
       int res[][]  = new int[m][n];
       System.out.println("enter the elements of matrix1 :");
       for(i=0;i<m;i++)
       {
          for(j=0;j<n;j++)
          {
              mat1[i][j]=sc.nextInt();
          }
       }
       System.out.println("enter the elements of matrix2 :");
       for(i=0;i<m;i++)
       {
          for(j=0;j<n;j++)
          {
              mat2[i][j]=sc.nextInt();
          }
       }
       for(i=0;i<m;i++)
       {
          for(j=0;j<n;j++)
          {
             res[i][j] = mat1[i][j]+mat2[i][j];
          }
       }
       System.out.println("sum of matrices: ");
       for(i=0;i<m;i++)
       {
           for(j=0;j<n;j++)
           {
              System.out.print(res[i][j]+"\t");
           }
         System.out.println();
       }
   }
}
