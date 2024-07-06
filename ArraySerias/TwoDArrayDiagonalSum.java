import java.util.*;
public class TwoDArrayDiagonalSum{
  public static void main(String x[])
  {
      Scanner sc = new Scanner(System.in);
      int a[][] = new int[3][3];
       int suml=0,sumr=0;
      System.out.println("\nEnter array values: ");
      for(int i= 0;i<3;i++)
      {
         for(int j= 0;j<3;j++)
         {
           a[i][j] = sc.nextInt();
         }
      }
       
      //display array
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
            System.out.printf("%d\t",a[i][j]);
        }
        System.out.println("\n");
      }

      //logic for diagonal sum
      for(int i= 0;i<3;i++)
      {
          
          for(int j=0;j<3;j++)
          {
              if(i==j)
              {
                 suml = suml +a[i][j];
              }   
              if(j==2-i)
              {
                 sumr = sumr+a[i][j];
              }
          }
      }

      System.out.printf("\nsum of left diagonal: %d\nsumof right diagonal:%d",suml,sumr);
  }
}