import java.util.*;
public class SumofArray{
   public static void main(String x[])
   {
      Scanner sc = new Scanner(System.in);
	  int a[] = new int[5];
	  System.out.println("\nEnter array: ");
	  for(int i= 0;i<a.length;i++)
	  {
	    a[i] =  sc.nextInt();
	  }
	  
	  System.out.println("\nDisplay Array: ");
	  for(int i= 0;i<a.length;i++)
	  {
	     System.out.printf("%d\t",a[i]);
	  }
	  
	  int sum = 0;
	  for(int i= 0;i<a.length;i++)
	  {
	    sum = sum+a[i];
	  }
	  
	  System.out.println("\nSum of Array is: " +sum);
   }
}