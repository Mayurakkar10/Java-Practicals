import java.util.*;
public class MergeArray{
  public static void main(String x[])
  {
     Scanner sc = new Scanner(System.in);
     int a[] = new int[5];
     int b[] = new int[5];
     int c[] = new int[10];
    
     System.out.println("\nEnter first array: ");
     for(int i= 0;i<5;i++)
     {
        a[i] = sc.nextInt();
     }

     System.out.println("\nEnter second array: ");
     for(int i= 0;i<5;i++)
     {
        b[i] = sc.nextInt();
     }
      
      int k = 0;
      for(int i= 0;i<a.length;i++,k++)
      {
          c[i]  = a[i];
      }
     
      for(int j = 0;j<b.length;j++)
      {
           c[k] = b[j];
            k++;
      }
  
       System.out.println("Display array: ");
       for(int i= 0;i<c.length;i++)
       {
         System.out.printf("%d\t",c[i]); 
       }
  }
}