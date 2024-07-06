import java.util.*;
public class SumofOnetoN{
   public static void main(String x[])
   {
       Scanner sc = new Scanner(System.in);
	   int N,sum = 0;
	   System.out.print("\nEnter Limit: ");
	   N = sc.nextInt();
	   
	   for(int i= 1;i<=N;i++)
	   {
	      sum = sum+i;
	   }
	   
	   System.out.println("sum = "+sum);
   }

}