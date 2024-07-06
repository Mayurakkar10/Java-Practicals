import java.util.*;
public class FibonacciSerias{
    public static void main(String x[])
    {
       int a[] = new int [5];
       a[0] = 0;
       a[1] = 1;
       for(int i =2;i<5;i++)
       {
          a[i] = a[i-1] +a[i-2];
       }

       System.out.println("\nDisplay array");
       for(int i= 0;i<5;i++)
       {
          System.out.printf("%d\t",a[i]);
       }
    
    }

}