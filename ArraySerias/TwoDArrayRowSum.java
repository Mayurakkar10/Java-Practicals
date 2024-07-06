import java.util.*;
public class TwoDArrayRowSum{
   public static void main(String x[])
   {
       Scanner sc = new Scanner(System.in);
       int a[][] = new int [3][3];
       System.out.println("\nEnter array: ");
       for(int i= 0;i<3;i++)
       {
          for(int j= 0;j<3;j++)
          {
             a[i][j] = sc.nextInt();
          }
       }
      
       //logic for display array sum
       int sum;
       for(int i =0;i<3;i++)
       {
           sum = 0;
           for(int j= 0;j<3;j++)
           {
              sum = sum+a[i][j];
              System.out.printf("%d\t",a[i][j]);
           }
          System.out.printf("= %d",sum);
          System.out.println("\n");
       }
   }

}