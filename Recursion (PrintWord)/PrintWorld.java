public class PrintWorld 
{
 public static void PrintnTimes(int n)
 {
  if( n > 1 )
  {
  
    System.out.println("Welcome to Java Land");
    PrintnTimes(n-1);
  
  } 
  else 
  {
    System.out.println("n should be higher than ZERO.");
    System.out.println("Try in again.");
  } 
 }
 public static void main(String [] args)
 {
  PrintnTimes(0);
  
 }
}