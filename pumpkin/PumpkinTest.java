import java.awt.*;


public class PumpkinTest
{
 public static void main(String [] args)
 {
  
  GraphicsFrame gf = new GraphicsFrame(); 
  
  Pumpkin p1 = new Pumpkin(100,200, 75,25, Color.ORANGE, "boooooooooooo");
  gf.add( p1 );
  
  Pumpkin p2 = new Pumpkin(300,400, 90,29, Color.RED, "big larry");
  gf.add( p2 ); 
 
 }
}