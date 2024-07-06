//jagged array
import java.util.*;
public class JaggedArray{
   public static void main(String x[])
   {
        Scanner sc = new Scanner(System.in);
        System.out.prinln("\nEnter array values: ");
        int a[][]  = new int [3][3];
        for(int i= 0;i<a.length;i++)
        {
          for(int j= 0;j<a[i].length;j++);
           {
                  a[i][j] = sc.nextInt();
           }
         }
     
         System.out.println("\nDisplay array: ");
         for(int i = 0;i<a.length;i++)
         {
           for(int j= 0;j<a[i].length;j++)
           {
                System.out.printf("%d\t",a[i][j]);
           }

         }
   }

}