import java.util.*;
public class MissingElement{
  public static void main(String x[])
  {
     int a[] = new int[5];
     Scanner sc = new Scanner(System.in);
     System.out.println("\nEnter array values: ");
     for(int i= 0;i<5;i++)
     {
         a[i] = sc.nextInt();
     }
     
     //logic for majority element
     /*int count;
     for(int i= 0;i<a.length;i++)
     {
        int diff = a[i+1] - a[i];
        if(diff>1)
        {
           count = a[0];
           while(count<a[i+1]-1)
           {
              ++count;
              System.out.printf("%d\t",count);
           }
        } 
     }*/

     for(int i= 0;i<a.length;i++)
     {
       int diff = a[i+1] - a[i];
       if(diff>1)
       {
          int count = a[i];
           for(int j= count;j<a[i+1]-1;j++)
           {
             ++count;
             System.out.printf("%d\t",count);
           }
       }
     }

  }

}