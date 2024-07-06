import java.util.*
public class ReverseNum{
   public static void main(String x[])
   {   
       Scanner sc = new Scanner(System.in);
	   int n,rev=0;
	   System.out.pritl("\nEnter number: ");
	   n = sc.nextInt();
	   while(n!=0)
	   {
	     num = num%10;
		 num = num/10;
		 rev = rev*10+rem;
	   }
	   
	   System.out.prinln("Reverse: " + rev);
	   
   }
}