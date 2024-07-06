import java.util.*;
public class SearchValueInArray{
   public static void main(String x[])
   {
       Scanner sc = new Scanner(System.in);
	   int a[] = new int[5];
	   int svalue;
	   boolean flag =false;
	   System.out.println("\nEnter array values: ");
	   for(int i= 0;i<a.length;i++)
	   {
	      a[i] = sc.nextInt();
	   }
	   
	   for(int i= 0;i<a.length;i++)
	   {
	      System.out.printf("%d\t",a[i]);
	   }
	   
	   System.out.println("\nEnter value to search: ");
	   svalue = sc.nextInt();
	   
	   for(int i= 0;i<a.length;i++)
	   {
	        if(svalue == a[i])
			{
			   System.out.println("Value found");
			   flag = true;
			}
	   }
	   
	   if(flag == false)
	   {
	      System.out.println("The value not found");

       }		  
	   
   }
}