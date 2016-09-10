import java.util.*;

public class IfTest
{
  public static void main (String [] args)
  {
    Scanner kb = new Scanner (System.in);
    
    int hits, atbats;
    boolean debug = false; 
    
    System.out.print(" Entter numbers of hits: ");
    hits = kb.nextInt();
    
    System.out.print(" Enter numbers of at-bats: ");
    atbats = kb.nextInt();
        
    float avg = (float) hits / atbats ;  
    System.out.println(" Average is " + avg );
 
     
    if (  avg > 0.330f )
    {
      System.out.println(" Good job. The player is eligible for the all stae games. :)");
    }
    else   
    {
      System.out.println(" Sorry ! the player is not eligible. :(");
    }
  }
}