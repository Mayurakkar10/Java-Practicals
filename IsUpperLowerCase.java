import java.util.*;
public class IsUpperLowerCase{
   public static void main(String x[])
   {
      Scanner sc = new Scanner(System.in);
	  char ch;
	  System.out.println("Enter character: ");
	  ch = sc.next().charAt(0);
	  
	  if(ch >=65 && ch<=90)
	  {
	     System.out.println("Uppercase Character");
	  }
	  else
	  {
	    System.out.println("LowerCase Character");
	  }
   }
}