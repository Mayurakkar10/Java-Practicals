import java.util.*;
public class ArrayApp{
   public static void main(String x[])
   {
     int a[] = {10,20,30,40,50};
     Scanner sc = new Scanner(System.in);
     int b[];
     b = a;
     b[1] = 2000;
  
     System.out.println("\nDisplay the array: ");
     for(int i=0;i<a.length;i++)
     {
        System.out.printf("%d\t",a[i]);
     }             
   }
}