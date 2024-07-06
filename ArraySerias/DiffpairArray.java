import java.util.*;
public class DiffpairArray{
  public static void main(String x[])
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("\nEnter diff: ");
      int diff = sc.nextInt();
      int a[] = new int[5];
      
      System.out.println("\nEnter array values: ");
      for(int i= 0;i<5;i++)
      {
           a[i] = sc.nextInt();
      }
      
      System.out.println("\nDisplay array: ");
      for(int i= 0;i<5;i++)
      {
          System.out.printf("%d\t",a[i]); 
      }

      //logic 
      for(int i = 0;i<5;i++)
      {
         for(int j= i+1;j<5;j++)
          {
               if(a[j]-a[i] == diff)
                {
                    System.out.printf("\nDiffrence pair:(%d,%d)\t",a[i],a[j]);
                }
          }
      }

  }
}