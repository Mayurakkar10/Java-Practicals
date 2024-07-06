import java.util.*;
public class SortArray{
   public static void main(String x[])
   {
     int a[]  = new int[5];
	 Scanner sc = new Scanner(System.in);
	 System.out.println("\nEnter array: ");
	 for(int i= 0;i<a.length;i++)
	 {
	    a[i] = sc.nextInt();
	 }
	 
	 System.out.println("\nBefore Sort Array: ");
	 for(int i= 0;i<a.length;i++)
	 {
	   System.out.printf("%d\t",a[i]);
	 }
	 
	 //logic to sort Ascending Order
	 for(int i= 0;i<a.length;i++)
	 {
	   for(int j = i+1;j<a.length;j++)
	   {
	      if(a[i]>a[j])
		  {
		    int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		  }
	   }
	 }
	 
	 System.out.println("\nAfter Sort In Asceding Order Array: ");
	 for(int i= 0;i<a.length;i++)
	 {
	   System.out.printf("%d\t",a[i]);
	 }
     
	 
	 //logic for sort In Descending order
	 for(int i= 0;i<a.length;i++)
	 {
	   for(int j = i+1;j<a.length;j++)
	   {
	      if(a[i]<a[j])
		  {
		    int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		  }
	   }
	 }
	 
	 System.out.println("\nAfter Sort In Desceding Order Array: ");
	 for(int i= 0;i<a.length;i++)
	 {
	   System.out.printf("%d\t",a[i]);
	 }
   }
}