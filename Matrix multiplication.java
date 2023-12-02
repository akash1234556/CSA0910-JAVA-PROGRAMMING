import java.io.*;
import java.util.*;
class matrixMultiplication
{
    public static void main(String[] args)
    {
       int i,j,k,row1,row2,col1,col2;
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the no.of rows in matrix1: ");
       row1=sc.nextInt();
       System.out.println("enter the no.of columns in matrix1: ");
       col1=sc.nextInt();
       System.out.println("enter the no.of rows in matrix2: ");
       row2=sc.nextInt();
       System.out.println("enter the no.of columns in matrix2: ");
       col2=sc.nextInt();
       if(col1!=row2)
       {
            System.out.println("matrix multiplication is not possible ");
       }
       else
       {
           int a[][]=new int[row1][col1];
           int b[][]=new int[row2][col2];
           int c[][]=new int[row1][col2];
           System.out.println("enter the matrix A elements: ");
           for(i=0;i<row1;i++)
           {
             for(j=0;j<col1;j++)
             {
                 a[i][j]=sc.nextInt();
             }
           }
           System.out.println("enter the matrix B elements: ");
           for(j=0;j<row2;j++)
           {
             for(k=0;k<col2;k++)
             {
                b[j][k]=sc.nextInt();
             }
           }
          System.out.println("matrix multiplication is : ");
          for(i=0;i<row1;i++)
          {
  	    for(j=0;j<col2;j++)
            {
               c[i][j]=0;
               for(k=0;k<col1;k++)
               {
                   c[i][j] += (a[i][k]*b[k][j]);
               }
               System.out.print(c[i][j]+" ");
            }
            System.out.println();
          }
       }
    }
}
