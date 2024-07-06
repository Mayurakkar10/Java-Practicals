import java.util.*;
public class MergeTwoArray{
   public static void main(String x[])
   {
        int a[] = new int[10];
        int b[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter first array: ");
        for(int i= 0;i<5;i++)
        {
           a[i] = sc.nextInt();
        } 
        
        System.out.println("\nEnter Second array: ");
        for(int i= 0;i<b.length;i++)
        {
           b[i] = sc.nextInt();
        } 

        //merge
        for(int i=0;i<b.length;i++)
        {
              a[5+i] = b[i];

        }

        for(int i= 0;i<a.length;i++)
         {
              System.out.printf("%d\t",a[i]);
         }
 
   }

}