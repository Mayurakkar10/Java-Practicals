public class CircleArea
{
   public static void main(String x[])
   {
       float radius,area,pi = 3.14;
	   radius = Float.nextFloat(x[0]);
	   area = pi * radius *radius;
	   System.out.println("Area: %d",area);
	   
   }
}