import java.util.*;
public class EvenOddArray{
   public static void main(String x[])
   {
       Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int EvenArray[] = new int [3];
        int OddArray[] = new int [3];
       System.out.println("\nEnter array values: ");
       for(int i= 0;i<5;i++)
       {
          a[i] = sc.nextInt();
       }

       //logic for even odd array
       int countEven=0,countOdd = 0;
       for(int i= 0;i<5;i++)
       {
           if(a[i]%2==0)
           {
             EvenArray[countEven++] = a[i];
           }
           else
           {
             OddArray[countOdd++] = a[i];
           }
       }

      
       //display even odd arrays
       System.out.println("\nEven Array: ");
       for(int i=0;i<3;i++)
       {
          System.out.printf("%d\t",EvenArray[i]);
       }

       System.out.println("\nOdd Array: ");
       for(int i= 0;i<5;i++)
       {
          System.out.printf("%d\t",OddArray[i]);   
       }       
   }

}