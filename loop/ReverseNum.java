import java.util.*;
public class ReverseNum{
   public static void main(String x[])
   {   
       Scanner sc = new Scanner(System.in);
	   int n,rev=0,rem;
	   System.out.println("\nEnter number: ");
	   n = sc.nextInt();
	   while(n!=0)
	   {
	     rem = n%10;
		 n = n/10;
		 rev = rev*10+rem;
	   }
	   
	   System.out.println("Reverse: " + rev);
	   
   }
}