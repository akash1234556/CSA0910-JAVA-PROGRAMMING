import java.io.*;
import java.util.*;
class MeanMedianMode
{
   public static void main(String[]args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the array size: ");
      int size=sc.nextInt();
      float arr[] = new float[size];
      float msum=0;
      System.out.println("enter the array elements : ");
      for(int i=0;i<size;i++)
      {
        arr[i]=sc.nextInt();
        msum+=arr[i];
      }
      float temp=0;
      for(int i=0;i<size;i++)
      {
         for(int j=i+1;j<size;j++)
         {
             if(arr[i]>arr[j])
             {
                  temp=arr[i];
                  arr[i]=arr[j];
  		  arr[j]=temp;
             }
         }
      }
      System.out.println("mean is :"+ (float)(msum/size));
      if(size%2 == 0)
      {
         System.out.println("median is :"+(float)((arr[size/2] +arr[(size/2)+1])/2));
      }
      else
      {
         System.out.println("Median is :"+(float)(arr[size/2]));
      }
      float max=0;
      int o_c=0,n_c=0;
      for(int i=0;i<size;i++)
      {
         for(int j=0;j<size;j++)
         {
            if(arr[i] == arr[j])
            {
                n_c++;
            }
         }
         if(o_c<n_c)
         {
            max=arr[i];
            o_c=n_c;
         }
         n_c=0;
      }
      System.out.println("Mode: "+max);
   }
}
