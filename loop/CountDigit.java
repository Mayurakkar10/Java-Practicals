import java.util.*;
public class CountDigit{
   public static void main(String x[])
   {
      Scanner sc = new Scanner(System.in);
	  int n,count=0;
	  System.out.print("\nEnter number: ");
	  n = sc.nextInt();
	  while(n!=0)
	  {
	     ++count;
		 n = n/10;
	  }
	  
	  System.out.println("Count of Digit: "+count);
   }
}