import java.util.*;
public class CeilandFloor{
   public static void main(String x[])
   {
       Scanner sc = new Scanner(System.in);
       int a[] = new int[5];
       
       //input array
       System.out.println("\nEnter array values: ");
       for(int i= 0;i<a.length;i++)
       {
          a[i] = sc.nextInt();
       }
       
       
       //input number
       System.out.println("\nEnter number: ");
       int number = sc.nextInt();

       //sort array
       for(int i= 0;i<a.length;i++)
       {
         for(int j= i+1;j<a.length;j++)
         {
             if(a[i]>a[j])
             {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
             }
         }
       }

       
       //Display Sorted Array
       System.out.println("Display sorted Array: ");
       for(int i= 0;i<a.length;i++)
       {
          System.out.printf("%d\t",a[i]);
       }

       //logic for ceilandFloor
       int ceiling = 0,floor=0;
       for(int i= 0;i<a.length;i++)
       {
         if(a[i]<a[0])
         {
             ceiling = a[0];
             floor = -1;
         }
         else if(number>a[a.length-1])
         {
            ceiling = a[a.length-1];
            floor = -1;
         }
         else if(a[i]==number)
         {
            ceiling = a[i];
            floor=a[i];
            break;
         }
         else if(number>a[i]&&number<a[i+1])
         {
            ceiling = a[i+1];
            floor = a[i];
            break;
        }
      }

      System.out.printf("\nceil = %d\nfloor = %d",ceiling,floor);
   }
}