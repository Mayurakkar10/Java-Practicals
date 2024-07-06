import java.util.*;
public class MaxMinValueInArray{
  public static void main(String x[])
  {
     Scanner sc = new Scanner(System.in);
	 int a[] = new int[5];
	 System.out.println("\nEnter array: ");
	 for(int i=0;i<a.length;i++)
	 {
	    a[i] = sc.nextInt();
	 }
	 
	 
	 System.out.println("Display Array: ");
	 for(int i= 0;i<a.length;i++)
	 {
	     System.out.printf("%d\t",a[i]);
	 }
	 
	 int max = a[0],min = a[0];
	 for(int i= 0;i<a.length;i++)
     {
	     if(a[i]>max)
         {
             max = a[i]; 
         }
         else if(a[i]<min)		 
		 {
			 min = a[i];
		 }
	 }	 
	 
	 System.out.println("\nmax: "+max+" min: "+min); 
  
  }

}