import java.util.Scanner; 

 public class IfTest
 {
  public static void main (String [] args)
  {
    Scanner kb = new Scanner ( System.in );
    
    int a,b;
    
    System.out.print("Enter an integer for a: ");
    a = kb.nextInt();
    
    
    System.out.print("Enter an integer for b: ");
    b = kb.nextInt();
    
    
    if ( a==b )
    {
     System.out.println( "a equals b" );
    }
    if ( a != b ) 
    {
     System.out.println( "a is not equal b. Sorry :(");
    }
    if ( a > b ) 
    {
     System.out.println( "a is grater than b.");
    }
    if ( a < b ) 
    {
     System.out.println( "b is grater than a.");
    }
  }
 }
