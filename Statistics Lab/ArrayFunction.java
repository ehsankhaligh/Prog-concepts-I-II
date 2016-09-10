
public class ArrayFunction
{
 public static void main(String [] args)
 {
    
  
  double [] nums = { 4.3f, 5.6f, 8.9f, 20.999999f};
  
  System.out.println( "avarage is : " +Stats.avarage( nums));
  System.out.println( "Standard diviation is: " + Stats.stdDev(nums));
  System.out.println( "Midian is: " + Stats.median( nums));




 }
}