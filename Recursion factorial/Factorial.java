public class Factorial
{
 public static int factorial( int n )
 {
   if (n >= 0)
   {
     return n*(n-1);
   } 
   else 
   
    return 0;
 
 }
 public static void main(String [] args)
 {
   System.out.println(factorial(0));
 }
}