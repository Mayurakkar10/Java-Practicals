import java.util.*;
public class  TwodimensionalArray{
   public static void main(String x[])
   {
      int a[][] = new int[3][3];
      Scanner sc = new Scanner(System.in);
      System.out.println("\nEnter array values: ");
      for(int i= 0;i<a.length;i++)
      {
         for(int j= 0;j<a.length;j++)
         {
            a[i][j] = sc.nextInt();
         }
      }

      //Display array
      for(int i = 0;i<a.length;i++)
      {
         for(int j= 0;j<a.length;j++)
         {
             System.out.printf("%d\t",a[i][j]);
         }
         System.out.println("");
      }
   }
}