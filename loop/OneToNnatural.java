import java.util.*;
public class OneToNnatural{
    public static void main(String x[])
    {
       Scanner sc = new Scanner(System.in);
       int N,i; 
       System.out.print("\nEnter limit: ");
       N = sc.nextInt();
       i = 1;
       while(i<=N)
       {
         System.out.println(i);
         i++; 
       }  
    }

}