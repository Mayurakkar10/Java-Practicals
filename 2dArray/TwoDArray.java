import java.util.*;
public class TwoDArray{
  
   public static void main(String x[])
  {
     Scanner sc = new Scanner(System.in);
	 int a[][] = new int [3][3];
	 int b[][] = new int [3][3];
     System.out.println("\nEnter first array: ");
	 for(int i= 0;i<3;i++)
	 {
	    for(int j= 0;j<3;j++)
		{
		   a[i][j] = sc.nextInt();	
		}
	 }
	 
	 System.out.println("\nEnter secondn array: ");
	 for(int i= 0;i<3;i++)
	 {
	    for(int j= 0;j<3;j++)
		{
		   b[i][j] = sc.nextInt();	
		}
	 }
	 
	 System.out.println("\nDisplay first array: ");
	 for(int i= 0;i<3;i++)
	 {
	   for(int j = 0;j<3;j++)
	   {
	     System.out.printf(" %d",a[i][j]);
	   }
	   System.out.println("\n");
	 }
	 
	 System.out.println("\nDisplay second array: ");
	 for(int i= 0;i<3;i++)
	 {
	   for(int j = 0;j<3;j++)
	   {
	     System.out.printf(" %d",b[i][j]);
	   }
	   System.out.println("\n");
	 }
	 
	 int sum = 0;
	 
	 for(int i=0;i<3;i++)
     {
	   for(int j= 0;j<3;j++)
	   {
		   a[i][j] = a[i][j]+b[i][j];
       }	
       System.out.println("\n");
	 }
	 
	 
	 System.out.println("\nDisplay sum of array: ");
	 for(int i= 0;i<3;i++)
	 {
	     for(int j = 0;j<3;j++)
		 {
			 System.out.printf(" %d",a[i][j]);
		 }
		 System.out.println("\n");
     }
  }

}