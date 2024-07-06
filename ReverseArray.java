import java.util.*;
public class ReverseArray{
  public static void main(String x[])
  {
      Scanner sc = new Scanner(System.in);
	  int a[] = new int [5];
	  System.out.println("\nEnter array values: ");
	  for(int i= 0;i<a.length;i++)
	  {
	     a[i] = sc.nextInt();
	  }
	  
	  System.out.println("\nBefore Array: ");
	  for(int i= 0;i<a.length;i++)
	  {
	     System.out.printf("%d\t",a[i]);
	  }
	  
	  //logic for reverse Array
	  for(int i= 0,j=a.length-1;i<a.length/2;i++,j--)
	  {
         int temp = a[i];
		 a[i]  = a[j];
		 a[j] = temp;
	  }
	  
	  System.out.println("\nAfter reverse Array: ");
	  for(int i= 0;i<a.length;i++)
	  {
	     System.out.printf("%d\t",a[i]);
	  }
	  
  }

}