import java.util.*;
public class FirstLastDigitSum{
 public static void main(String x[])
 {
      int fd=0,ld=0,n,count = 0,sum=0;
      Scanner sc = new Scanner(System.in);
      System.out.print("\nEnter number: ");
      n = sc.nextInt();
      int temp = n;
      ld = n%10;
      while(temp!=0)
      {
        ++count;
        temp = temp/10; 
      }

      int base = 10,power = count-1;
      int i= 1,p = 1;
      while(i<=power)
      {
        p = p*base;
        i++;
      }
   
     fd = n/p;
     sum = fd +ld;
     System.out.println("\nFirst Digit: "+fd+"\nLast Digit: " +ld);
     System.out.println("sum of first and last digit: "+sum);
 }
}